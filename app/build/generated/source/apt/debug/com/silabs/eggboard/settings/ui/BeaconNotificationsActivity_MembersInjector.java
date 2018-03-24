package com.silabs.eggboard.settings.ui;

import com.silabs.eggboard.common.data.PreferenceManager;
import com.silabs.eggboard.common.ui.ThunderBoardActivity;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class BeaconNotificationsActivity_MembersInjector implements MembersInjector<BeaconNotificationsActivity> {
  private final MembersInjector<ThunderBoardActivity> supertypeInjector;
  private final Provider<PreferenceManager> prefsManagerProvider;

  public BeaconNotificationsActivity_MembersInjector(MembersInjector<ThunderBoardActivity> supertypeInjector, Provider<PreferenceManager> prefsManagerProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert prefsManagerProvider != null;
    this.prefsManagerProvider = prefsManagerProvider;
  }

  @Override
  public void injectMembers(BeaconNotificationsActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.prefsManager = prefsManagerProvider.get();
  }

  public static MembersInjector<BeaconNotificationsActivity> create(MembersInjector<ThunderBoardActivity> supertypeInjector, Provider<PreferenceManager> prefsManagerProvider) {  
      return new BeaconNotificationsActivity_MembersInjector(supertypeInjector, prefsManagerProvider);
  }
}

