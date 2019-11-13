package com.subhash.deezer.ui;

import com.subhash.deezer.di.FragmentScoped;
import com.subhash.deezer.ui.album.AlbumFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = UiModule_AlbumFragment$app_debug.AlbumFragmentSubcomponent.class)
public abstract class UiModule_AlbumFragment$app_debug {
  private UiModule_AlbumFragment$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(AlbumFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AlbumFragmentSubcomponent.Factory builder);

  @Subcomponent
  @FragmentScoped
  public interface AlbumFragmentSubcomponent extends AndroidInjector<AlbumFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AlbumFragment> {}
  }
}
