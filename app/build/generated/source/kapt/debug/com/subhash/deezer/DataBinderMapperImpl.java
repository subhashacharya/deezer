package com.subhash.deezer;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.subhash.deezer.databinding.AlbumFragmentBindingImpl;
import com.subhash.deezer.databinding.AlbumResultViewItemBindingImpl;
import com.subhash.deezer.databinding.SearchFragmentBindingImpl;
import com.subhash.deezer.databinding.SearchResultArtistViewItemBindingImpl;
import com.subhash.deezer.databinding.SearchResultHeaderViewItemBindingImpl;
import com.subhash.deezer.databinding.TrackResultViewItemBindingImpl;
import com.subhash.deezer.databinding.TracksFragmentBindingImpl;
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
  private static final int LAYOUT_ALBUMFRAGMENT = 1;

  private static final int LAYOUT_ALBUMRESULTVIEWITEM = 2;

  private static final int LAYOUT_SEARCHFRAGMENT = 3;

  private static final int LAYOUT_SEARCHRESULTARTISTVIEWITEM = 4;

  private static final int LAYOUT_SEARCHRESULTHEADERVIEWITEM = 5;

  private static final int LAYOUT_TRACKRESULTVIEWITEM = 6;

  private static final int LAYOUT_TRACKSFRAGMENT = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.subhash.deezer.R.layout.album_fragment, LAYOUT_ALBUMFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.subhash.deezer.R.layout.album_result_view_item, LAYOUT_ALBUMRESULTVIEWITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.subhash.deezer.R.layout.search_fragment, LAYOUT_SEARCHFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.subhash.deezer.R.layout.search_result_artist_view_item, LAYOUT_SEARCHRESULTARTISTVIEWITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.subhash.deezer.R.layout.search_result_header_view_item, LAYOUT_SEARCHRESULTHEADERVIEWITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.subhash.deezer.R.layout.track_result_view_item, LAYOUT_TRACKRESULTVIEWITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.subhash.deezer.R.layout.tracks_fragment, LAYOUT_TRACKSFRAGMENT);
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
        case  LAYOUT_ALBUMFRAGMENT: {
          if ("layout/album_fragment_0".equals(tag)) {
            return new AlbumFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for album_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_ALBUMRESULTVIEWITEM: {
          if ("layout/album_result_view_item_0".equals(tag)) {
            return new AlbumResultViewItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for album_result_view_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SEARCHFRAGMENT: {
          if ("layout/search_fragment_0".equals(tag)) {
            return new SearchFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for search_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_SEARCHRESULTARTISTVIEWITEM: {
          if ("layout/search_result_artist_view_item_0".equals(tag)) {
            return new SearchResultArtistViewItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for search_result_artist_view_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SEARCHRESULTHEADERVIEWITEM: {
          if ("layout/search_result_header_view_item_0".equals(tag)) {
            return new SearchResultHeaderViewItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for search_result_header_view_item is invalid. Received: " + tag);
        }
        case  LAYOUT_TRACKRESULTVIEWITEM: {
          if ("layout/track_result_view_item_0".equals(tag)) {
            return new TrackResultViewItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for track_result_view_item is invalid. Received: " + tag);
        }
        case  LAYOUT_TRACKSFRAGMENT: {
          if ("layout/tracks_fragment_0".equals(tag)) {
            return new TracksFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for tracks_fragment is invalid. Received: " + tag);
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
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "album");
      sKeys.put(2, "header");
      sKeys.put(3, "item");
      sKeys.put(4, "listener");
      sKeys.put(5, "track");
      sKeys.put(6, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/album_fragment_0", com.subhash.deezer.R.layout.album_fragment);
      sKeys.put("layout/album_result_view_item_0", com.subhash.deezer.R.layout.album_result_view_item);
      sKeys.put("layout/search_fragment_0", com.subhash.deezer.R.layout.search_fragment);
      sKeys.put("layout/search_result_artist_view_item_0", com.subhash.deezer.R.layout.search_result_artist_view_item);
      sKeys.put("layout/search_result_header_view_item_0", com.subhash.deezer.R.layout.search_result_header_view_item);
      sKeys.put("layout/track_result_view_item_0", com.subhash.deezer.R.layout.track_result_view_item);
      sKeys.put("layout/tracks_fragment_0", com.subhash.deezer.R.layout.tracks_fragment);
    }
  }
}
