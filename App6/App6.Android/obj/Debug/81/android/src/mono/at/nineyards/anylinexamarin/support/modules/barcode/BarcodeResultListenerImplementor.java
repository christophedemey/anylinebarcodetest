package mono.at.nineyards.anylinexamarin.support.modules.barcode;


public class BarcodeResultListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		at.nineyards.anylinexamarin.support.modules.barcode.BarcodeResultListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResult:(Lat/nineyards/anyline/modules/barcode/BarcodeResult;)V:GetOnResult_Lat_nineyards_anyline_modules_barcode_BarcodeResult_Handler:AT.Nineyards.Anylinexamarin.Support.Modules.Barcode.IBarcodeResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("AT.Nineyards.Anylinexamarin.Support.Modules.Barcode.IBarcodeResultListenerImplementor, AnylineXamarinSDK.Droid", BarcodeResultListenerImplementor.class, __md_methods);
	}


	public BarcodeResultListenerImplementor ()
	{
		super ();
		if (getClass () == BarcodeResultListenerImplementor.class)
			mono.android.TypeManager.Activate ("AT.Nineyards.Anylinexamarin.Support.Modules.Barcode.IBarcodeResultListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onResult (at.nineyards.anyline.modules.barcode.BarcodeResult p0)
	{
		n_onResult (p0);
	}

	private native void n_onResult (at.nineyards.anyline.modules.barcode.BarcodeResult p0);

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
