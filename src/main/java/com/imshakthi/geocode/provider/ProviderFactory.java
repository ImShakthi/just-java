package com.imshakthi.geocode.provider;

import com.imshakthi.geocode.model.Capability;
import com.imshakthi.geocode.model.ProviderTypes;
import com.imshakthi.geocode.provider.impl.GoogleMapsProvider;
import com.imshakthi.geocode.provider.impl.OpenStreetMapProvider;
import com.imshakthi.geocode.provider.impl.TomTomMapProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProviderFactory {
  private final Map<ProviderTypes, Provider> providers = new HashMap<>();

  public ProviderFactory() {
    this.providers.put(ProviderTypes.GOOGLE_MAPS, new GoogleMapsProvider());
    this.providers.put(ProviderTypes.OPEN_STREET_MAPS, new OpenStreetMapProvider());
    this.providers.put(ProviderTypes.TOM_TOM, new TomTomMapProvider());
  }

  public Optional<Provider> getGeoCodeProvider(final ProviderTypes providerType) {
    final var provider = providers.get(providerType);
    if (provider != null && provider.supportsCapability(Capability.GEOCODE)) {
      return Optional.of(provider);
    }
    return Optional.empty();
  }

  public Optional<Provider> getReverseGeoCodeProvider(final ProviderTypes providerType) {
    final var provider = providers.get(providerType);
    if (provider != null && provider.supportsCapability(Capability.REVERSE_GEOCODE)) {
      return Optional.of(provider);
    }
    return Optional.empty();
  }

  public List<Provider> getGeoCodeProviders() {
    return providers.values().stream()
        .filter(provider -> provider.supportsCapability(Capability.GEOCODE))
        .collect(Collectors.toList());
  }

  public List<Provider> getReverseGeoCodeProviders() {
    return providers.values().stream()
        .filter(provider -> provider.supportsCapability(Capability.REVERSE_GEOCODE))
        .collect(Collectors.toList());
  }
}
