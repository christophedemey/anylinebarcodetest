package mono.io.anyline.plugin;


public class ScanInfoListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.anyline.plugin.ScanInfoListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInfo:(Lio/anyline/plugin/ScanInfo;)V:GetOnInfo_Lio_anyline_plugin_ScanInfo_Handler:IO.Anyline.Plugin.IScanInfoListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("IO.Anyline.Plugin.IScanInfoListenerImplementor, AnylineXamarinSDK.Droid", ScanInfoListenerImplementor.class, __md_methods);
	}


	public ScanInfoListenerImplementor ()
	{
		super ();
		if (getClass () == ScanInfoListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Anyline.Plugin.IScanInfoListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onInfo (io.anyline.plugin.ScanInfo p0)
	{
		n_onInfo (p0);
	}

	private native void n_onInfo (io.anyline.plugin.ScanInfo p0);

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
