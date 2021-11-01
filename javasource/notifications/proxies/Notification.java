// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package notifications.proxies;

public class Notification
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject notificationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Notifications.Notification";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Title("Title"),
		Message("Message"),
		Read("Read"),
		AssociatedObject("AssociatedObject"),
		Notification_Account("Notifications.Notification_Account"),
		Notification_VacationRequest("Notifications.Notification_VacationRequest");

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

	public Notification(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Notifications.Notification"));
	}

	protected Notification(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject notificationMendixObject)
	{
		if (notificationMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Notifications.Notification", notificationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Notifications.Notification");

		this.notificationMendixObject = notificationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Notification.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static notifications.proxies.Notification initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return notifications.proxies.Notification.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static notifications.proxies.Notification initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new notifications.proxies.Notification(context, mendixObject);
	}

	public static notifications.proxies.Notification load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return notifications.proxies.Notification.initialize(context, mendixObject);
	}

	public static java.util.List<notifications.proxies.Notification> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<notifications.proxies.Notification> result = new java.util.ArrayList<notifications.proxies.Notification>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Notifications.Notification" + xpathConstraint))
			result.add(notifications.proxies.Notification.initialize(context, obj));
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
	 * @return value of Title
	 */
	public final java.lang.String getTitle()
	{
		return getTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of Title
	 */
	public final java.lang.String getTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Title.toString());
	}

	/**
	 * Set value of Title
	 * @param title
	 */
	public final void setTitle(java.lang.String title)
	{
		setTitle(getContext(), title);
	}

	/**
	 * Set value of Title
	 * @param context
	 * @param title
	 */
	public final void setTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String title)
	{
		getMendixObject().setValue(context, MemberNames.Title.toString(), title);
	}

	/**
	 * @return value of Message
	 */
	public final java.lang.String getMessage()
	{
		return getMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of Message
	 */
	public final java.lang.String getMessage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Message.toString());
	}

	/**
	 * Set value of Message
	 * @param message
	 */
	public final void setMessage(java.lang.String message)
	{
		setMessage(getContext(), message);
	}

	/**
	 * Set value of Message
	 * @param context
	 * @param message
	 */
	public final void setMessage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String message)
	{
		getMendixObject().setValue(context, MemberNames.Message.toString(), message);
	}

	/**
	 * @return value of Read
	 */
	public final java.lang.Boolean getRead()
	{
		return getRead(getContext());
	}

	/**
	 * @param context
	 * @return value of Read
	 */
	public final java.lang.Boolean getRead(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Read.toString());
	}

	/**
	 * Set value of Read
	 * @param read
	 */
	public final void setRead(java.lang.Boolean read)
	{
		setRead(getContext(), read);
	}

	/**
	 * Set value of Read
	 * @param context
	 * @param read
	 */
	public final void setRead(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean read)
	{
		getMendixObject().setValue(context, MemberNames.Read.toString(), read);
	}

	/**
	 * @return value of AssociatedObject
	 */
	public final java.lang.Long getAssociatedObject()
	{
		return getAssociatedObject(getContext());
	}

	/**
	 * @param context
	 * @return value of AssociatedObject
	 */
	public final java.lang.Long getAssociatedObject(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.AssociatedObject.toString());
	}

	/**
	 * Set value of AssociatedObject
	 * @param associatedobject
	 */
	public final void setAssociatedObject(java.lang.Long associatedobject)
	{
		setAssociatedObject(getContext(), associatedobject);
	}

	/**
	 * Set value of AssociatedObject
	 * @param context
	 * @param associatedobject
	 */
	public final void setAssociatedObject(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long associatedobject)
	{
		getMendixObject().setValue(context, MemberNames.AssociatedObject.toString(), associatedobject);
	}

	/**
	 * @return value of Notification_Account
	 */
	public final java.util.List<administration.proxies.Account> getNotification_Account() throws com.mendix.core.CoreException
	{
		return getNotification_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of Notification_Account
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<administration.proxies.Account> getNotification_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<administration.proxies.Account> result = new java.util.ArrayList<administration.proxies.Account>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Notification_Account.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(administration.proxies.Account.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Notification_Account
	 * @param notification_account
	 */
	public final void setNotification_Account(java.util.List<administration.proxies.Account> notification_account)
	{
		setNotification_Account(getContext(), notification_account);
	}

	/**
	 * Set value of Notification_Account
	 * @param context
	 * @param notification_account
	 */
	public final void setNotification_Account(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<administration.proxies.Account> notification_account)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (administration.proxies.Account proxyObject : notification_account)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Notification_Account.toString(), identifiers);
	}

	/**
	 * @return value of Notification_VacationRequest
	 */
	public final vacationmanagement.proxies.VacationRequest getNotification_VacationRequest() throws com.mendix.core.CoreException
	{
		return getNotification_VacationRequest(getContext());
	}

	/**
	 * @param context
	 * @return value of Notification_VacationRequest
	 */
	public final vacationmanagement.proxies.VacationRequest getNotification_VacationRequest(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		vacationmanagement.proxies.VacationRequest result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Notification_VacationRequest.toString());
		if (identifier != null)
			result = vacationmanagement.proxies.VacationRequest.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Notification_VacationRequest
	 * @param notification_vacationrequest
	 */
	public final void setNotification_VacationRequest(vacationmanagement.proxies.VacationRequest notification_vacationrequest)
	{
		setNotification_VacationRequest(getContext(), notification_vacationrequest);
	}

	/**
	 * Set value of Notification_VacationRequest
	 * @param context
	 * @param notification_vacationrequest
	 */
	public final void setNotification_VacationRequest(com.mendix.systemwideinterfaces.core.IContext context, vacationmanagement.proxies.VacationRequest notification_vacationrequest)
	{
		if (notification_vacationrequest == null)
			getMendixObject().setValue(context, MemberNames.Notification_VacationRequest.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Notification_VacationRequest.toString(), notification_vacationrequest.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return notificationMendixObject;
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
			final notifications.proxies.Notification that = (notifications.proxies.Notification) obj;
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
		return "Notifications.Notification";
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
