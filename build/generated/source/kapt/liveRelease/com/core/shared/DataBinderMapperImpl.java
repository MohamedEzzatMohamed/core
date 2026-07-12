package com.core.shared;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.core.shared.databinding.ActivityScanQrcodeBindingImpl;
import com.core.shared.databinding.FragmentCheckNetworkBindingImpl;
import com.core.shared.databinding.FragmentImageCaptureBindingImpl;
import com.core.shared.databinding.FragmentImageCaptureBindingLandImpl;
import com.core.shared.databinding.FragmentScanQrCodeBindingImpl;
import com.core.shared.databinding.FragmentScanQrCodeBindingLandImpl;
import com.core.shared.databinding.FragmentShowingCountryCodeBindingImpl;
import com.core.shared.databinding.ItemCountriesCodeBindingImpl;
import com.core.shared.databinding.LayoutNetworkConnectionStateBindingImpl;
import com.core.shared.databinding.LayoutSelectLanguageBindingImpl;
import com.core.shared.databinding.LayoutSmartzoneDialogBindingImpl;
import com.core.shared.databinding.LayoutSmartzoneProgressDialogBindingImpl;
import com.core.shared.databinding.LayoutSmartzoneSnackbarBindingImpl;
import com.core.shared.databinding.LoadStateItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYSCANQRCODE = 1;

  private static final int LAYOUT_FRAGMENTCHECKNETWORK = 2;

  private static final int LAYOUT_FRAGMENTIMAGECAPTURE = 3;

  private static final int LAYOUT_FRAGMENTSCANQRCODE = 4;

  private static final int LAYOUT_FRAGMENTSHOWINGCOUNTRYCODE = 5;

  private static final int LAYOUT_ITEMCOUNTRIESCODE = 6;

  private static final int LAYOUT_LAYOUTNETWORKCONNECTIONSTATE = 7;

  private static final int LAYOUT_LAYOUTSELECTLANGUAGE = 8;

  private static final int LAYOUT_LAYOUTSMARTZONEDIALOG = 9;

  private static final int LAYOUT_LAYOUTSMARTZONEPROGRESSDIALOG = 10;

  private static final int LAYOUT_LAYOUTSMARTZONESNACKBAR = 11;

  private static final int LAYOUT_LOADSTATEITEM = 12;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(12);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.core.shared.R.layout.activity_scan_qrcode, LAYOUT_ACTIVITYSCANQRCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.core.shared.R.layout.fragment_check_network, LAYOUT_FRAGMENTCHECKNETWORK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.core.shared.R.layout.fragment_image_capture, LAYOUT_FRAGMENTIMAGECAPTURE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.core.shared.R.layout.fragment_scan_qr_code, LAYOUT_FRAGMENTSCANQRCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.core.shared.R.layout.fragment_showing_country_code, LAYOUT_FRAGMENTSHOWINGCOUNTRYCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.core.shared.R.layout.item_countries_code, LAYOUT_ITEMCOUNTRIESCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.core.shared.R.layout.layout_network_connection_state, LAYOUT_LAYOUTNETWORKCONNECTIONSTATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.core.shared.R.layout.layout_select_language, LAYOUT_LAYOUTSELECTLANGUAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.core.shared.R.layout.layout_smartzone_dialog, LAYOUT_LAYOUTSMARTZONEDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.core.shared.R.layout.layout_smartzone_progress_dialog, LAYOUT_LAYOUTSMARTZONEPROGRESSDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.core.shared.R.layout.layout_smartzone_snackbar, LAYOUT_LAYOUTSMARTZONESNACKBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.core.shared.R.layout.load_state_item, LAYOUT_LOADSTATEITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYSCANQRCODE: {
          if ("layout/activity_scan_qrcode_0".equals(tag)) {
            return new ActivityScanQrcodeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_scan_qrcode is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHECKNETWORK: {
          if ("layout/fragment_check_network_0".equals(tag)) {
            return new FragmentCheckNetworkBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_check_network is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTIMAGECAPTURE: {
          if ("layout/fragment_image_capture_0".equals(tag)) {
            return new FragmentImageCaptureBindingImpl(component, view);
          }
          if ("layout-land/fragment_image_capture_0".equals(tag)) {
            return new FragmentImageCaptureBindingLandImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_image_capture is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSCANQRCODE: {
          if ("layout/fragment_scan_qr_code_0".equals(tag)) {
            return new FragmentScanQrCodeBindingImpl(component, view);
          }
          if ("layout-land/fragment_scan_qr_code_0".equals(tag)) {
            return new FragmentScanQrCodeBindingLandImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_scan_qr_code is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSHOWINGCOUNTRYCODE: {
          if ("layout/fragment_showing_country_code_0".equals(tag)) {
            return new FragmentShowingCountryCodeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_showing_country_code is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCOUNTRIESCODE: {
          if ("layout/item_countries_code_0".equals(tag)) {
            return new ItemCountriesCodeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_countries_code is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTNETWORKCONNECTIONSTATE: {
          if ("layout/layout_network_connection_state_0".equals(tag)) {
            return new LayoutNetworkConnectionStateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_network_connection_state is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSELECTLANGUAGE: {
          if ("layout/layout_select_language_0".equals(tag)) {
            return new LayoutSelectLanguageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_select_language is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSMARTZONEDIALOG: {
          if ("layout/layout_smartzone_dialog_0".equals(tag)) {
            return new LayoutSmartzoneDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_smartzone_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSMARTZONEPROGRESSDIALOG: {
          if ("layout/layout_smartzone_progress_dialog_0".equals(tag)) {
            return new LayoutSmartzoneProgressDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_smartzone_progress_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSMARTZONESNACKBAR: {
          if ("layout/layout_smartzone_snackbar_0".equals(tag)) {
            return new LayoutSmartzoneSnackbarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_smartzone_snackbar is invalid. Received: " + tag);
        }
        case  LAYOUT_LOADSTATEITEM: {
          if ("layout/load_state_item_0".equals(tag)) {
            return new LoadStateItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for load_state_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.fawry.fawrypay.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "activity");
      sKeys.put(2, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(14);

    static {
      sKeys.put("layout/activity_scan_qrcode_0", com.core.shared.R.layout.activity_scan_qrcode);
      sKeys.put("layout/fragment_check_network_0", com.core.shared.R.layout.fragment_check_network);
      sKeys.put("layout/fragment_image_capture_0", com.core.shared.R.layout.fragment_image_capture);
      sKeys.put("layout-land/fragment_image_capture_0", com.core.shared.R.layout.fragment_image_capture);
      sKeys.put("layout/fragment_scan_qr_code_0", com.core.shared.R.layout.fragment_scan_qr_code);
      sKeys.put("layout-land/fragment_scan_qr_code_0", com.core.shared.R.layout.fragment_scan_qr_code);
      sKeys.put("layout/fragment_showing_country_code_0", com.core.shared.R.layout.fragment_showing_country_code);
      sKeys.put("layout/item_countries_code_0", com.core.shared.R.layout.item_countries_code);
      sKeys.put("layout/layout_network_connection_state_0", com.core.shared.R.layout.layout_network_connection_state);
      sKeys.put("layout/layout_select_language_0", com.core.shared.R.layout.layout_select_language);
      sKeys.put("layout/layout_smartzone_dialog_0", com.core.shared.R.layout.layout_smartzone_dialog);
      sKeys.put("layout/layout_smartzone_progress_dialog_0", com.core.shared.R.layout.layout_smartzone_progress_dialog);
      sKeys.put("layout/layout_smartzone_snackbar_0", com.core.shared.R.layout.layout_smartzone_snackbar);
      sKeys.put("layout/load_state_item_0", com.core.shared.R.layout.load_state_item);
    }
  }
}
