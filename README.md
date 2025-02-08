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

























{
    "id": 4601,
    "title": "overtimePolicy",
    "overtimeApplicableAfter": 2.0,
    "baselineOTRateType": "FLAT",
    "baselineOTRate": null,
    "baselineOTRateSlotBased": [
        {
            "minutesUpto": 4,
            "amount": 5.0
        }
    ],
    "hasSpecialOTRateOnWeekend": true,
    "weekendOTRateType": "FLAT",
    "weekendOTRate": null,
    "weekendOTRateSlotBased": [
        {
            "minutesUpto": 6,
            "amount": 4.0
        }
    ],
    "hasSpecialOTRateOnReligiousHoliday": true,
    "religiousHolidayOTRateType": "FLAT",
    "religiousHolidayOTRate": null,
    "religiousHolidayOTRateSlotBased": [
        {
            "minutesUpto": 4,
            "amount": 3.0
        }
    ],
    "hasSpecialOTRateOnOtherHoliday": true,
    "otherHolidayOTRateType": null,
    "otherHolidayOTRate": null,
    "otherHolidayOTRateSlotBased": [
        {
            "minutesUpto": 3,
            "amount": 4.0
        }
    ],
    "hasFirstMealAllowance": true,
    "firstMealAllowanceAmount": 4.0,
    "firstMealAllowanceType": "PER_MONTH",
    "hasMinWorkingHourForFirstMealAllowance": true,
    "minWorkingHourForFirstMealAllowance": 4.0,
    "hasMinWorkingTimeForFirstMealAllowance": true,
    "minWorkingTimeForFirstMealAllowance": null,
    "hasSecondMealAllowance": true,
    "secondMealAllowanceAmount": 4.0,
    "secondMealAllowanceType": "PER_DAY",
    "hasMinWorkingHourForSecondMealAllowance": true,
    "minWorkingHourForSecondMealAllowance": 4.0,
    "hasMinWorkingTimeForSecondMealAllowance": true,
    "minWorkingTimeForSecondMealAllowance": null,
    "hasThirdMealAllowance": true,
    "thirdMealAllowanceAmount": 2.0,
    "thirdMealAllowanceType": "PER_DAY",
    "hasMinWorkingHourForThirdMealAllowance": true,
    "minWorkingHourForThirdMealAllowance": 6.0,
    "hasMinWorkingTimeForThirdMealAllowance": true,
    "minWorkingTimeForThirdMealAllowance": null,
    "hasTransportAllowance": true,
    "transportAllowanceAmount": 7.0,
    "transportAllowanceEligibleGender": "FEMALE",
    "transportAllowanceType": "PER_DAY",
    "hasMinWorkingHourForTransportAllowance": true,
    "minWorkingHourForTransportAllowance": 7.0,
    "hasMinWorkingTimeForTransportAllowance": true,
    "minWorkingTimeForTransportAllowance": "2025-02-07T18:00:00Z",
    "hasNightShiftAllowance": true,
    "nightShiftAllowanceAmount": 7.0,
    "nightShiftAllowanceEligibleGender": "MALE",
    "nightShiftAllowanceType": null,
    "hasMinWorkingHourForNightShiftAllowance": true,
    "minWorkingHourForNightShiftAllowance": 7.0,
    "hasMinWorkingTimeForNightShiftAllowance": true,
    "minWorkingTimeForNightShiftAllowance": "2025-02-07T18:00:00Z",
    "hasWeekendAllowance": true,
    "weekendAllowanceAmount": 7.0,
    "weekendAllowanceType": null,
    "hasMinWorkingHourForWeekendAllowance": true,
    "minWorkingHourForWeekendAllowance": 7.0,
    "hasMinWorkingTimeForWeekendAllowance": true,
    "minWorkingTimeForWeekendAllowance": "2025-02-07T18:00:00Z",
    "hasReligiousHolidayAllowance": true,
    "religiousHolidayAllowanceAmount": 7.0,
    "religiousHolidayAllowanceType": "PER_DAY",
    "hasMinWorkingHourForReligiousHolidayAllowance": true,
    "minWorkingHourForReligiousHolidayAllowance": 8.0,
    "hasMinWorkingTimeForReligiousHolidayAllowance": true,
    "minWorkingTimeForReligiousHolidayAllowance": null,
    "hasOtherHolidayAllowance": true,
    "otherHolidayAllowanceAmount": 8.0,
    "otherHolidayAllowanceType": "PER_DAY",
    "hasMinWorkingHourForOtherHolidayAllowance": true,
    "minWorkingHourForOtherHolidayAllowance": 7.0,
    "hasMinWorkingTimeForOtherHolidayAllowance": true,
    "minWorkingTimeForOtherHolidayAllowance": null,
    "hasDailyHourCappingLimit": true,
    "dailyMaxAllowedHours": 6.0,
    "hasDailyBillAmountCappingLimit": true,
    "dailyMaxBillAmount": 9.0,
    "hasWeeklyHourCappingLimit": true,
    "weeklyMaxAllowedHours": 4.0,
    "hasWeeklyDayCappingLimit": true,
    "weeklyMaxAllowedDays": 2,
    "hasWeeklyBillAmountCappingLimit": true,
    "weeklyMaxBillAmount": 3.0,
    "hasWeeklyHolidayAllowanceCappingLimit": true,
    "weeklyHolidayAllowanceCappingLimit": 5,
    "hasWeeklyMealAllowanceCappingLimit": true,
    "weeklyMealAllowanceCappingLimit": 5,
    "hasWeeklyTransportAllowanceCappingLimit": true,
    "weeklyTransportAllowanceCappingLimit": 5,
    "hasWeeklyNightShiftAllowanceCappingLimit": true,
    "weeklyNightShiftAllowanceCappingLimit": 5,
    "hasMonthlyHourCappingLimit": true,
    "monthlyMaxAllowedHours": 5.0,
    "hasMonthlyDayCappingLimit": true,
    "monthlyMaxAllowedDays": 5,
    "hasMonthlyBillAmountCappingLimit": true,
    "monthlyMaxBillAmount": 7.0,
    "hasMonthlyHolidayAllowanceCappingLimit": true,
    "monthlyHolidayAllowanceCappingLimit": 1,
    "hasMonthlyMealAllowanceCappingLimit": true,
    "monthlyMealAllowanceCappingLimit": 3,
    "hasMonthlyTransportAllowanceCappingLimit": true,
    "monthlyTransportAllowanceCappingLimit": 2,
    "hasMonthlyNightShiftAllowanceCappingLimit": true,
    "monthlyNightShiftAllowanceCappingLimit": 4,
    "createdAt": "2025-02-08T12:21:56.931119768Z",
    "updatedAt": "2025-02-07T18:00:00Z",
    "createdById": 3,
    "createdByLogin": null,
    "updatedById": null,
    "updatedByLogin": null,
    "weekendOTSlotBased": null,
    "baselineOTSlotBased": null,
    "religiousHolidayOTSlotBased": null,
    "otherHolidayOTSlotBased": null
}
