package com.example.kafruitver;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBarActivity;

public class TabsSwipeActionBar extends ActionBarActivity implements ActionBar.TabListener, OnPageChangeListener {

private ViewPager mViewPager;;
	
	protected void onCreate(Bundle arg0){
		super.onCreate(arg0);
		setContentView(R.layout.tabs);
		
		PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(adapter);
        mViewPager.setOnPageChangeListener(this);
        
        ActionBar actionBar = getSupportActionBar();
		actionBar.setTitle("KaFruitVer");
	    actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		Tab tab = actionBar.newTab().setText(R.string.fruit).setTabListener(this);
		actionBar.addTab(tab);

		tab = actionBar.newTab().setText(R.string.vegetable).setTabListener(this);
		actionBar.addTab(tab);

		tab = actionBar.newTab().setText(R.string.other).setTabListener(this);
		actionBar.addTab(tab);
		
		tab = actionBar.newTab().setText(R.string.buy).setTabListener(this);
		actionBar.addTab(tab);
		
		/**MOSTRAR BOTON ATRAS EN ACTION BAR**/
		//actionBar.setDisplayHomeAsUpEnabled(true);
	}

	public void onBackPressed() {
		super.onBackPressed();
		finish();
	}
		
	public class PagerAdapter extends FragmentPagerAdapter {

		public PagerAdapter(FragmentManager fm){super(fm);}

		public Fragment getItem(int arg0){
			switch (arg0){
	            case 0:
	                return new FruitFragment();
	            case 1:
	                return new VegetableFragment();
	            case 2:
	                return new OtherFragment();
	            case 3:
	            	return new ListBuyFragment();
	            default:
	            	return null;
			}
		}

		public int getCount(){return 4;}
    }

	/** INTERFACE ONPAGECHANGELISTENER **/
	public void onPageSelected(int arg0){getSupportActionBar().setSelectedNavigationItem(arg0);}
	
	public void onPageScrollStateChanged(int arg0){}
	
	public void onPageScrolled(int arg0, float arg1, int arg2){}
	
	/** INTERFACE ACTIONBAR.TABLISTENER **/
	public void onTabSelected(Tab arg0, FragmentTransaction arg1){mViewPager.setCurrentItem(arg0.getPosition());}
	
	public void onTabReselected(Tab arg0, FragmentTransaction arg1){}
	
	public void onTabUnselected(Tab arg0, FragmentTransaction arg1){}
		
	/** INTERFACE ACTIONBAR INFERIOR **/
	/*public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.bottonbar, menu);
		return super.onCreateOptionsMenu(menu);
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
        	case R.id.icono_search:
        		Toast.makeText(getApplicationContext(), "BUSCAR", Toast.LENGTH_SHORT).show();
        		return true;
        	case R.id.icono_carro:
        		Toast.makeText(getApplicationContext(), "AÑADIR A CESTA", Toast.LENGTH_SHORT).show();
        		return true;
        	default:
        		return super.onOptionsItemSelected(item);
		}
	}*/

}