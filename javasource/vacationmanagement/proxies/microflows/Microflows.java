// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package vacationmanagement.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the VacationManagement module
	public static void aCL_RecoverRequestDay(IContext context, vacationmanagement.proxies.VacationRequest _vacationRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("VacationRequest", _vacationRequest == null ? null : _vacationRequest.getMendixObject());
		Core.microflowCall("VacationManagement.ACL_RecoverRequestDay").withParams(params).execute(context);
	}
	public static void aCT_ApproveRequest(IContext context, vacationmanagement.proxies.VacationRequest _vacationRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("VacationRequest", _vacationRequest == null ? null : _vacationRequest.getMendixObject());
		Core.microflowCall("VacationManagement.ACT_ApproveRequest").withParams(params).execute(context);
	}
	public static void aCT_CAL_VacationRequest_TotalHoursRequested(IContext context, vacationmanagement.proxies.VacationRequest _vacationRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("VacationRequest", _vacationRequest == null ? null : _vacationRequest.getMendixObject());
		Core.microflowCall("VacationManagement.ACT_CAL_VacationRequest_TotalHoursRequested").withParams(params).execute(context);
	}
	public static void aCT_GenerateVacationDays(IContext context, vacationmanagement.proxies.VacationRequest _vacationRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("VacationRequest", _vacationRequest == null ? null : _vacationRequest.getMendixObject());
		Core.microflowCall("VacationManagement.ACT_GenerateVacationDays").withParams(params).execute(context);
	}
	public static void aCT_RejectRequest(IContext context, vacationmanagement.proxies.VacationRequest _vacationRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("VacationRequest", _vacationRequest == null ? null : _vacationRequest.getMendixObject());
		Core.microflowCall("VacationManagement.ACT_RejectRequest").withParams(params).execute(context);
	}
	public static void aCT_VacationRequest_Submit(IContext context, vacationmanagement.proxies.VacationRequest _vacationRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("VacationRequest", _vacationRequest == null ? null : _vacationRequest.getMendixObject());
		Core.microflowCall("VacationManagement.ACT_VacationRequest_Submit").withParams(params).execute(context);
	}
}