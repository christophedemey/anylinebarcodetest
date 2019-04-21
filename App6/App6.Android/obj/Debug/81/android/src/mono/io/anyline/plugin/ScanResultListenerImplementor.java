package mono.io.anyline.plugin;


public class ScanResultListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.anyline.plugin.ScanResultListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResult:(Lio/anyline/plugin/ScanResult;)V:GetOnResult_Lio_anyline_plugin_ScanResult_Handler:IO.Anyline.Plugin.IScanResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("IO.Anyline.Plugin.IScanResultListenerImplementor, AnylineXamarinSDK.Droid", ScanResultListenerImplementor.class, __md_methods);
	}


	public ScanResultListenerImplementor ()
	{
		super ();
		if (getClass () == ScanResultListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Anyline.Plugin.IScanResultListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onResult (io.anyline.plugin.ScanResult p0)
	{
		n_onResult (p0);
	}

	private native void n_onResult (io.anyline.plugin.ScanResult p0);

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
