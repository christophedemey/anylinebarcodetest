package mono.at.nineyards.anylinexamarin.support.modules.ocr;


public class AnylineOcrResultListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		at.nineyards.anylinexamarin.support.modules.ocr.AnylineOcrResultListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResult:(Lat/nineyards/anyline/modules/ocr/AnylineOcrResult;)V:GetOnResult_Lat_nineyards_anyline_modules_ocr_AnylineOcrResult_Handler:AT.Nineyards.Anylinexamarin.Support.Modules.Ocr.IAnylineOcrResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("AT.Nineyards.Anylinexamarin.Support.Modules.Ocr.IAnylineOcrResultListenerImplementor, AnylineXamarinSDK.Droid", AnylineOcrResultListenerImplementor.class, __md_methods);
	}


	public AnylineOcrResultListenerImplementor ()
	{
		super ();
		if (getClass () == AnylineOcrResultListenerImplementor.class)
			mono.android.TypeManager.Activate ("AT.Nineyards.Anylinexamarin.Support.Modules.Ocr.IAnylineOcrResultListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onResult (at.nineyards.anyline.modules.ocr.AnylineOcrResult p0)
	{
		n_onResult (p0);
	}

	private native void n_onResult (at.nineyards.anyline.modules.ocr.AnylineOcrResult p0);

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
