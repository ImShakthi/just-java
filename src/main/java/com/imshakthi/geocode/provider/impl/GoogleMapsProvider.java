package com.imshakthi.geocode.provider.impl;

import com.imshakthi.geocode.model.Capability;
import com.imshakthi.geocode.provider.Provider;

import java.util.List;

// Google Maps Provider (Supports both geocode & reverse-geocode)
public class GoogleMapsProvider implements Provider {

  @Override
  public List<Capability> getSupportedCapabilities() {
    return List.of(Capability.GEOCODE, Capability.REVERSE_GEOCODE);
  }

  @Override
  public String geocode(String address) {
    return "Google Maps geocode result for " + address;
  }

  @Override
  public String reverseGeocode(double latitude, double longitude) {
    return "Google Maps reverse-geocode result for " + latitude + ", " + longitude;
  }
}
