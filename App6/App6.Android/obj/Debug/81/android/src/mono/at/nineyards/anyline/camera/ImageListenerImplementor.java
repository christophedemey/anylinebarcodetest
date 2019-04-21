package mono.at.nineyards.anyline.camera;


public class ImageListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		at.nineyards.anyline.camera.ImageListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onImageAvailable:(Lat/nineyards/anyline/camera/ImageReceiver;)V:GetOnImageAvailable_Lat_nineyards_anyline_camera_ImageReceiver_Handler:AT.Nineyards.Anyline.Camera.IImageListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("AT.Nineyards.Anyline.Camera.IImageListenerImplementor, AnylineXamarinSDK.Droid", ImageListenerImplementor.class, __md_methods);
	}


	public ImageListenerImplementor ()
	{
		super ();
		if (getClass () == ImageListenerImplementor.class)
			mono.android.TypeManager.Activate ("AT.Nineyards.Anyline.Camera.IImageListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onImageAvailable (at.nineyards.anyline.camera.ImageReceiver p0)
	{
		n_onImageAvailable (p0);
	}

	private native void n_onImageAvailable (at.nineyards.anyline.camera.ImageReceiver p0);

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
