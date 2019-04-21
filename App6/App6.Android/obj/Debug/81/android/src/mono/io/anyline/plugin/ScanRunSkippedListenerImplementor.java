package mono.io.anyline.plugin;


public class ScanRunSkippedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.anyline.plugin.ScanRunSkippedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onRunSkipped:(Lio/anyline/plugin/ScanRunSkippedReason;)V:GetOnRunSkipped_Lio_anyline_plugin_ScanRunSkippedReason_Handler:IO.Anyline.Plugin.IScanRunSkippedListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("IO.Anyline.Plugin.IScanRunSkippedListenerImplementor, AnylineXamarinSDK.Droid", ScanRunSkippedListenerImplementor.class, __md_methods);
	}


	public ScanRunSkippedListenerImplementor ()
	{
		super ();
		if (getClass () == ScanRunSkippedListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Anyline.Plugin.IScanRunSkippedListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onRunSkipped (io.anyline.plugin.ScanRunSkippedReason p0)
	{
		n_onRunSkipped (p0);
	}

	private native void n_onRunSkipped (io.anyline.plugin.ScanRunSkippedReason p0);

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
