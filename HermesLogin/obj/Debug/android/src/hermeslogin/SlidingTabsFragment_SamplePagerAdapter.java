package hermeslogin;


public class SlidingTabsFragment_SamplePagerAdapter
	extends android.support.v4.view.PagerAdapter
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_getCount:()I:GetGetCountHandler\n" +
			"n_isViewFromObject:(Landroid/view/View;Ljava/lang/Object;)Z:GetIsViewFromObject_Landroid_view_View_Ljava_lang_Object_Handler\n" +
			"n_instantiateItem:(Landroid/view/ViewGroup;I)Ljava/lang/Object;:GetInstantiateItem_Landroid_view_ViewGroup_IHandler\n" +
			"n_destroyItem:(Landroid/view/ViewGroup;ILjava/lang/Object;)V:GetDestroyItem_Landroid_view_ViewGroup_ILjava_lang_Object_Handler\n" +
			"";
		mono.android.Runtime.register ("HermesLogin.SlidingTabsFragment/SamplePagerAdapter, HermesLogin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", SlidingTabsFragment_SamplePagerAdapter.class, __md_methods);
	}


	public SlidingTabsFragment_SamplePagerAdapter () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SlidingTabsFragment_SamplePagerAdapter.class)
			mono.android.TypeManager.Activate ("HermesLogin.SlidingTabsFragment/SamplePagerAdapter, HermesLogin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public int getCount ()
	{
		return n_getCount ();
	}

	private native int n_getCount ();


	public boolean isViewFromObject (android.view.View p0, java.lang.Object p1)
	{
		return n_isViewFromObject (p0, p1);
	}

	private native boolean n_isViewFromObject (android.view.View p0, java.lang.Object p1);


	public java.lang.Object instantiateItem (android.view.ViewGroup p0, int p1)
	{
		return n_instantiateItem (p0, p1);
	}

	private native java.lang.Object n_instantiateItem (android.view.ViewGroup p0, int p1);


	public void destroyItem (android.view.ViewGroup p0, int p1, java.lang.Object p2)
	{
		n_destroyItem (p0, p1, p2);
	}

	private native void n_destroyItem (android.view.ViewGroup p0, int p1, java.lang.Object p2);

	java.util.ArrayList refList;
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
