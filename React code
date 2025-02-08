import React, { useState } from 'react';
import { TrashIcon, PlusIcon } from 'lucide-react';

const OvertimeRateForm = () => {
  const [isSlotBased, setIsSlotBased] = useState(false);
  const [slotRates, setSlotRates] = useState([
    { minutesUpto: '', amount: '' }
  ]);

  const handleCheckboxChange = (e) => {
    setIsSlotBased(e.target.checked);
  };

  const handleSlotRateChange = (index, field, value) => {
    const updatedSlotRates = slotRates.map((rate, i) => {
      if (i === index) {
        return { ...rate, [field]: value };
      }
      return rate;
    });
    setSlotRates(updatedSlotRates);
  };

  const addNewSlotRate = (index) => {
    const currentRate = slotRates[index];
    if (currentRate.minutesUpto && currentRate.amount) {
      setSlotRates([...slotRates, { minutesUpto: '', amount: '' }]);
    }
  };

  const deleteSlotRate = (index) => {
    if (slotRates.length > 1) {
      const updatedSlotRates = slotRates.filter((_, i) => i !== index);
      setSlotRates(updatedSlotRates);
    }
  };

  return (
    <div className="container">
      <div className="w-1/6 mt-4">
        <div className="flex items-center pt-8">
          <input
            type="checkbox"
            id="field_isBaselineOTSlotBased"
            name="isBaselineOTSlotBased"
            checked={isSlotBased}
            onChange={handleCheckboxChange}
            className="form-checkbox h-4 w-4"
          />
          <label 
            htmlFor="field_isBaselineOTSlotBased" 
            className="ml-2 mb-0"
          >
            Is Slot Based
          </label>
        </div>
      </div>

      {isSlotBased && (
        <div className="w-1/2 mt-4" id="overTimeSlotRate">
          {slotRates.map((rate, index) => (
            <div 
              key={index} 
              className="flex flex-row items-center gap-4 mb-4" 
              id={`formRow-${index}`}
            >
              <div className="w-5/12">
                <label className="block mb-1">Minutes (Up To)</label>
                <input
                  type="number"
                  className="w-full px-3 py-2 border rounded"
                  name="minutesUpto"
                  id="minutesUpto"
                  value={rate.minutesUpto}
                  onChange={(e) => handleSlotRateChange(index, 'minutesUpto', e.target.value)}
                />
              </div>

              <div className="w-5/12">
                <label className="block mb-1">TK</label>
                <input
                  type="number"
                  className="w-full px-3 py-2 border rounded"
                  name="amount"
                  id="amount"
                  value={rate.amount}
                  onChange={(e) => handleSlotRateChange(index, 'amount', e.target.value)}
                />
              </div>

              <div className="w-2/12 flex gap-2 mt-6">
                {slotRates.length > 1 && (
                  <button
                    type="button"
                    className="p-2 bg-red-600 text-white rounded hover:bg-red-700"
                    onClick={() => deleteSlotRate(index)}
                  >
                    <TrashIcon size={16} />
                  </button>
                )}

                {index === slotRates.length - 1 && (
                  <button
                    type="button"
                    className="p-2 bg-gray-600 text-white rounded hover:bg-gray-700"
                    onClick={() => addNewSlotRate(index)}
                  >
                    <PlusIcon size={16} />
                  </button>
                )}
              </div>
            </div>
          ))}
        </div>
      )}
    </div>
  );
};

export default OvertimeRateForm;
