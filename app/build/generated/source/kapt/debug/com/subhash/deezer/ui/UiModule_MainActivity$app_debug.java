package com.subhash.deezer.ui;

import com.subhash.deezer.MainActivity;
import com.subhash.deezer.di.ActivityScoped;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = UiModule_MainActivity$app_debug.MainActivitySubcomponent.class)
public abstract class UiModule_MainActivity$app_debug {
  private UiModule_MainActivity$app_debug() {}

  @Binds
  @IntoMap
  @ClassKey(MainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Factory builder);

  @Subcomponent
  @ActivityScoped
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}
  }
}
