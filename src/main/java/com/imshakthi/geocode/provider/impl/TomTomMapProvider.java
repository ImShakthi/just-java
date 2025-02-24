package com.imshakthi.geocode.provider.impl;

import com.imshakthi.geocode.model.Capability;
import com.imshakthi.geocode.provider.Provider;

import java.util.List;

// Maps Provider (Only supports reverse geocode)
public class TomTomMapProvider implements Provider {

  @Override
  public List<Capability> getSupportedCapabilities() {
    return List.of(Capability.REVERSE_GEOCODE);
  }

  @Override
  public String geocode(String address) {
    throw new UnsupportedOperationException("Here Maps does not support geocoding.");
  }

  @Override
  public String reverseGeocode(double latitude, double longitude) {
    return "Here Maps reverse-geocode result for " + latitude + ", " + longitude;
  }
}
