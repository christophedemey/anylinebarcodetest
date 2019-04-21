package mono.io.anyline.xamarin.support.plugins.id;


public class IdResultListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.anyline.xamarin.support.plugins.id.IdResultListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResult:(Lio/anyline/xamarin/support/plugins/id/IdScanResult;)V:GetOnResult_Lio_anyline_xamarin_support_plugins_id_IdScanResult_Handler:IO.Anyline.Xamarin.Support.Plugins.ID.IIdResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("IO.Anyline.Xamarin.Support.Plugins.ID.IIdResultListenerImplementor, AnylineXamarinSDK.Droid", IdResultListenerImplementor.class, __md_methods);
	}


	public IdResultListenerImplementor ()
	{
		super ();
		if (getClass () == IdResultListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Anyline.Xamarin.Support.Plugins.ID.IIdResultListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onResult (io.anyline.xamarin.support.plugins.id.IdScanResult p0)
	{
		n_onResult (p0);
	}

	private native void n_onResult (io.anyline.xamarin.support.plugins.id.IdScanResult p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
