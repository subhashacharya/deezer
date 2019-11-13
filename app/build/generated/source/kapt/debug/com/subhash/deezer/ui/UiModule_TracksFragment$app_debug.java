package com.subhash.deezer.ui;

import com.subhash.deezer.di.FragmentScoped;
import com.subhash.deezer.ui.tracks.TracksFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = UiModule_TracksFragment$app_debug.TracksFragmentSubcomponent.class)
public abstract class UiModule_TracksFragment$app_debug {
  private UiModule_TracksFragment$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(TracksFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      TracksFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScoped
  public interface TracksFragmentSubcomponent extends AndroidInjector<TracksFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<TracksFragment> {}
  }
}
