package mono.at.nineyards.anyline.camera;


public class NativeBarcodeResultListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		at.nineyards.anyline.camera.NativeBarcodeResultListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFailure:(Ljava/lang/String;)V:GetOnFailure_Ljava_lang_String_Handler:AT.Nineyards.Anyline.Camera.INativeBarcodeResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onSuccess:(Ljava/util/List;)V:GetOnSuccess_Ljava_util_List_Handler:AT.Nineyards.Anyline.Camera.INativeBarcodeResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("AT.Nineyards.Anyline.Camera.INativeBarcodeResultListenerImplementor, AnylineXamarinSDK.Droid", NativeBarcodeResultListenerImplementor.class, __md_methods);
	}


	public NativeBarcodeResultListenerImplementor ()
	{
		super ();
		if (getClass () == NativeBarcodeResultListenerImplementor.class)
			mono.android.TypeManager.Activate ("AT.Nineyards.Anyline.Camera.INativeBarcodeResultListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onFailure (java.lang.String p0)
	{
		n_onFailure (p0);
	}

	private native void n_onFailure (java.lang.String p0);


	public void onSuccess (java.util.List p0)
	{
		n_onSuccess (p0);
	}

	private native void n_onSuccess (java.util.List p0);

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
