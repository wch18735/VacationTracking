// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package vacationmanagement.proxies;

/**
 * VacationRequestDay: 해당 날에 얼마나 휴가를 가지는가
 */
public class VacationRequest
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject vacationRequestMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "VacationManagement.VacationRequest";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		StartDate("StartDate"),
		EndDate("EndDate"),
		RequestType("RequestType"),
		VacationRequestStatus("VacationRequestStatus"),
		Description("Description"),
		TotalHoursRequested("TotalHoursRequested"),
		VacationRequest_Approver("VacationManagement.VacationRequest_Approver"),
		VacationRequest_Submitter("VacationManagement.VacationRequest_Submitter");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public VacationRequest(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "VacationManagement.VacationRequest"));
	}

	protected VacationRequest(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject vacationRequestMendixObject)
	{
		if (vacationRequestMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("VacationManagement.VacationRequest", vacationRequestMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a VacationManagement.VacationRequest");

		this.vacationRequestMendixObject = vacationRequestMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'VacationRequest.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static vacationmanagement.proxies.VacationRequest initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return vacationmanagement.proxies.VacationRequest.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static vacationmanagement.proxies.VacationRequest initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new vacationmanagement.proxies.VacationRequest(context, mendixObject);
	}

	public static vacationmanagement.proxies.VacationRequest load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return vacationmanagement.proxies.VacationRequest.initialize(context, mendixObject);
	}

	public static java.util.List<vacationmanagement.proxies.VacationRequest> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<vacationmanagement.proxies.VacationRequest> result = new java.util.ArrayList<vacationmanagement.proxies.VacationRequest>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//VacationManagement.VacationRequest" + xpathConstraint))
			result.add(vacationmanagement.proxies.VacationRequest.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate()
	{
		return getStartDate(getContext());
	}

	/**
	 * @param context
	 * @return value of StartDate
	 */
	public final java.util.Date getStartDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartDate.toString());
	}

	/**
	 * Set value of StartDate
	 * @param startdate
	 */
	public final void setStartDate(java.util.Date startdate)
	{
		setStartDate(getContext(), startdate);
	}

	/**
	 * Set value of StartDate
	 * @param context
	 * @param startdate
	 */
	public final void setStartDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date startdate)
	{
		getMendixObject().setValue(context, MemberNames.StartDate.toString(), startdate);
	}

	/**
	 * @return value of EndDate
	 */
	public final java.util.Date getEndDate()
	{
		return getEndDate(getContext());
	}

	/**
	 * @param context
	 * @return value of EndDate
	 */
	public final java.util.Date getEndDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.EndDate.toString());
	}

	/**
	 * Set value of EndDate
	 * @param enddate
	 */
	public final void setEndDate(java.util.Date enddate)
	{
		setEndDate(getContext(), enddate);
	}

	/**
	 * Set value of EndDate
	 * @param context
	 * @param enddate
	 */
	public final void setEndDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date enddate)
	{
		getMendixObject().setValue(context, MemberNames.EndDate.toString(), enddate);
	}

	/**
	 * Set value of RequestType
	 * @param requesttype
	 */
	public final vacationmanagement.proxies.ENU_VacationRequestType getRequestType()
	{
		return getRequestType(getContext());
	}

	/**
	 * @param context
	 * @return value of RequestType
	 */
	public final vacationmanagement.proxies.ENU_VacationRequestType getRequestType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.RequestType.toString());
		if (obj == null)
			return null;

		return vacationmanagement.proxies.ENU_VacationRequestType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of RequestType
	 * @param requesttype
	 */
	public final void setRequestType(vacationmanagement.proxies.ENU_VacationRequestType requesttype)
	{
		setRequestType(getContext(), requesttype);
	}

	/**
	 * Set value of RequestType
	 * @param context
	 * @param requesttype
	 */
	public final void setRequestType(com.mendix.systemwideinterfaces.core.IContext context, vacationmanagement.proxies.ENU_VacationRequestType requesttype)
	{
		if (requesttype != null)
			getMendixObject().setValue(context, MemberNames.RequestType.toString(), requesttype.toString());
		else
			getMendixObject().setValue(context, MemberNames.RequestType.toString(), null);
	}

	/**
	 * Set value of VacationRequestStatus
	 * @param vacationrequeststatus
	 */
	public final vacationmanagement.proxies.ENU_VacationRequestStatus getVacationRequestStatus()
	{
		return getVacationRequestStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of VacationRequestStatus
	 */
	public final vacationmanagement.proxies.ENU_VacationRequestStatus getVacationRequestStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.VacationRequestStatus.toString());
		if (obj == null)
			return null;

		return vacationmanagement.proxies.ENU_VacationRequestStatus.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of VacationRequestStatus
	 * @param vacationrequeststatus
	 */
	public final void setVacationRequestStatus(vacationmanagement.proxies.ENU_VacationRequestStatus vacationrequeststatus)
	{
		setVacationRequestStatus(getContext(), vacationrequeststatus);
	}

	/**
	 * Set value of VacationRequestStatus
	 * @param context
	 * @param vacationrequeststatus
	 */
	public final void setVacationRequestStatus(com.mendix.systemwideinterfaces.core.IContext context, vacationmanagement.proxies.ENU_VacationRequestStatus vacationrequeststatus)
	{
		if (vacationrequeststatus != null)
			getMendixObject().setValue(context, MemberNames.VacationRequestStatus.toString(), vacationrequeststatus.toString());
		else
			getMendixObject().setValue(context, MemberNames.VacationRequestStatus.toString(), null);
	}

	/**
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of TotalHoursRequested
	 */
	public final java.lang.Integer getTotalHoursRequested()
	{
		return getTotalHoursRequested(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalHoursRequested
	 */
	public final java.lang.Integer getTotalHoursRequested(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.TotalHoursRequested.toString());
	}

	/**
	 * Set value of TotalHoursRequested
	 * @param totalhoursrequested
	 */
	public final void setTotalHoursRequested(java.lang.Integer totalhoursrequested)
	{
		setTotalHoursRequested(getContext(), totalhoursrequested);
	}

	/**
	 * Set value of TotalHoursRequested
	 * @param context
	 * @param totalhoursrequested
	 */
	public final void setTotalHoursRequested(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer totalhoursrequested)
	{
		getMendixObject().setValue(context, MemberNames.TotalHoursRequested.toString(), totalhoursrequested);
	}

	/**
	 * @return value of VacationRequest_Approver
	 */
	public final administration.proxies.Account getVacationRequest_Approver() throws com.mendix.core.CoreException
	{
		return getVacationRequest_Approver(getContext());
	}

	/**
	 * @param context
	 * @return value of VacationRequest_Approver
	 */
	public final administration.proxies.Account getVacationRequest_Approver(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.VacationRequest_Approver.toString());
		if (identifier != null)
			result = administration.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of VacationRequest_Approver
	 * @param vacationrequest_approver
	 */
	public final void setVacationRequest_Approver(administration.proxies.Account vacationrequest_approver)
	{
		setVacationRequest_Approver(getContext(), vacationrequest_approver);
	}

	/**
	 * Set value of VacationRequest_Approver
	 * @param context
	 * @param vacationrequest_approver
	 */
	public final void setVacationRequest_Approver(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account vacationrequest_approver)
	{
		if (vacationrequest_approver == null)
			getMendixObject().setValue(context, MemberNames.VacationRequest_Approver.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.VacationRequest_Approver.toString(), vacationrequest_approver.getMendixObject().getId());
	}

	/**
	 * @return value of VacationRequest_Submitter
	 */
	public final administration.proxies.Account getVacationRequest_Submitter() throws com.mendix.core.CoreException
	{
		return getVacationRequest_Submitter(getContext());
	}

	/**
	 * @param context
	 * @return value of VacationRequest_Submitter
	 */
	public final administration.proxies.Account getVacationRequest_Submitter(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.VacationRequest_Submitter.toString());
		if (identifier != null)
			result = administration.proxies.Account.load(context, identifier);
		return result;
	}

	/**
	 * Set value of VacationRequest_Submitter
	 * @param vacationrequest_submitter
	 */
	public final void setVacationRequest_Submitter(administration.proxies.Account vacationrequest_submitter)
	{
		setVacationRequest_Submitter(getContext(), vacationrequest_submitter);
	}

	/**
	 * Set value of VacationRequest_Submitter
	 * @param context
	 * @param vacationrequest_submitter
	 */
	public final void setVacationRequest_Submitter(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account vacationrequest_submitter)
	{
		if (vacationrequest_submitter == null)
			getMendixObject().setValue(context, MemberNames.VacationRequest_Submitter.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.VacationRequest_Submitter.toString(), vacationrequest_submitter.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return vacationRequestMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final vacationmanagement.proxies.VacationRequest that = (vacationmanagement.proxies.VacationRequest) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "VacationManagement.VacationRequest";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
