package com.imshakthi.geocode.service;

import com.imshakthi.geocode.model.ProviderTypes;
import com.imshakthi.geocode.provider.ProviderFactory;

public class LocationService {
  private final ProviderFactory providerFactory = new ProviderFactory();

  public String getGeocode(final String address, final ProviderTypes providerType) {
    return providerFactory
        .getGeoCodeProvider(providerType)
        .orElseThrow(() -> new UnsupportedOperationException("Geocode provider not found"))
        .geocode(address);
  }

  public String getReverseGeocode(
      final Double latitude, final Double longitude, final ProviderTypes providerType) {
    return providerFactory
        .getReverseGeoCodeProvider(providerType)
        .orElseThrow(() -> new UnsupportedOperationException("Reverse geocode provider not found"))
        .reverseGeocode(latitude, longitude);
  }
}
