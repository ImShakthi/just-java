package com.imshakthi.geocode.provider.impl;

import com.imshakthi.geocode.model.Capability;
import com.imshakthi.geocode.provider.Provider;

import java.util.List;

// OpenStreetMap Provider (Only supports geocode)
public class OpenStreetMapProvider implements Provider {

  @Override
  public List<Capability> getSupportedCapabilities() {
    return List.of(Capability.GEOCODE);
  }

  @Override
  public String geocode(String address) {
    return "OSM geocode result for " + address;
  }

  @Override
  public String reverseGeocode(double latitude, double longitude) {
    throw new UnsupportedOperationException("OSM does not support reverse geocoding.");
  }
}
