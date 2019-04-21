package mono.io.anyline.xamarin.support.plugins.meter;


public class MeterResultListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.anyline.xamarin.support.plugins.meter.MeterResultListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResult:(Lio/anyline/xamarin/support/plugins/meter/MeterScanResult;)V:GetOnResult_Lio_anyline_xamarin_support_plugins_meter_MeterScanResult_Handler:IO.Anyline.Xamarin.Support.Plugins.Meter.IMeterResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("IO.Anyline.Xamarin.Support.Plugins.Meter.IMeterResultListenerImplementor, AnylineXamarinSDK.Droid", MeterResultListenerImplementor.class, __md_methods);
	}


	public MeterResultListenerImplementor ()
	{
		super ();
		if (getClass () == MeterResultListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Anyline.Xamarin.Support.Plugins.Meter.IMeterResultListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onResult (io.anyline.xamarin.support.plugins.meter.MeterScanResult p0)
	{
		n_onResult (p0);
	}

	private native void n_onResult (io.anyline.xamarin.support.plugins.meter.MeterScanResult p0);

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
