package mono.at.nineyards.anyline.camera;


public class HighResolutionImageListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		at.nineyards.anyline.camera.HighResolutionImageListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onError:(Ljava/lang/Throwable;)V:GetOnError_Ljava_lang_Throwable_Handler:AT.Nineyards.Anyline.Camera.IHighResolutionImageListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onImageTaken:(Lat/nineyards/anyline/models/AnylineImage;)V:GetOnImageTaken_Lat_nineyards_anyline_models_AnylineImage_Handler:AT.Nineyards.Anyline.Camera.IHighResolutionImageListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("AT.Nineyards.Anyline.Camera.IHighResolutionImageListenerImplementor, AnylineXamarinSDK.Droid", HighResolutionImageListenerImplementor.class, __md_methods);
	}


	public HighResolutionImageListenerImplementor ()
	{
		super ();
		if (getClass () == HighResolutionImageListenerImplementor.class)
			mono.android.TypeManager.Activate ("AT.Nineyards.Anyline.Camera.IHighResolutionImageListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onError (java.lang.Throwable p0)
	{
		n_onError (p0);
	}

	private native void n_onError (java.lang.Throwable p0);


	public void onImageTaken (at.nineyards.anyline.models.AnylineImage p0)
	{
		n_onImageTaken (p0);
	}

	private native void n_onImageTaken (at.nineyards.anyline.models.AnylineImage p0);

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
