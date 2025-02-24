package com.imshakthi.geocode.provider;

import com.imshakthi.geocode.model.Capability;
import java.util.List;

public interface Provider {

  List<Capability> getSupportedCapabilities();

  String geocode(final String address);

  String reverseGeocode(double latitude, double longitude);

  default boolean supportsCapability(final Capability capability) {
    return getSupportedCapabilities().contains(capability);
  }
}
