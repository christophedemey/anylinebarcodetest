package mono.at.nineyards.anylinexamarin.support.modules.energy;


public class EnergyResultListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		at.nineyards.anylinexamarin.support.modules.energy.EnergyResultListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResult:(Lat/nineyards/anyline/modules/energy/EnergyResult;)V:GetOnResult_Lat_nineyards_anyline_modules_energy_EnergyResult_Handler:AT.Nineyards.Anylinexamarin.Support.Modules.Energy.IEnergyResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("AT.Nineyards.Anylinexamarin.Support.Modules.Energy.IEnergyResultListenerImplementor, AnylineXamarinSDK.Droid", EnergyResultListenerImplementor.class, __md_methods);
	}


	public EnergyResultListenerImplementor ()
	{
		super ();
		if (getClass () == EnergyResultListenerImplementor.class)
			mono.android.TypeManager.Activate ("AT.Nineyards.Anylinexamarin.Support.Modules.Energy.IEnergyResultListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onResult (at.nineyards.anyline.modules.energy.EnergyResult p0)
	{
		n_onResult (p0);
	}

	private native void n_onResult (at.nineyards.anyline.modules.energy.EnergyResult p0);

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
