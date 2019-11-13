package com.subhash.deezer.ui;

import com.subhash.deezer.di.FragmentScoped;
import com.subhash.deezer.ui.search.SearchFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = UiModule_SearchFragment$app_debug.SearchFragmentSubcomponent.class)
public abstract class UiModule_SearchFragment$app_debug {
  private UiModule_SearchFragment$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(SearchFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SearchFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScoped
  public interface SearchFragmentSubcomponent extends AndroidInjector<SearchFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SearchFragment> {}
  }
}
