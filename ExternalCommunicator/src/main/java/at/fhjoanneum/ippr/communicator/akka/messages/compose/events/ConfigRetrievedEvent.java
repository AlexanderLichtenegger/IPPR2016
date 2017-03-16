package at.fhjoanneum.ippr.communicator.akka.messages.compose.events;

import at.fhjoanneum.ippr.communicator.persistence.entities.basic.AbstractBasicOutboundConfiguration;
import at.fhjoanneum.ippr.communicator.persistence.objects.internal.InternalData;

public class ConfigRetrievedEvent {

  private final Long id;
  private final String transferId;
  private final InternalData data;
  private final AbstractBasicOutboundConfiguration basicConfiguration;

  public ConfigRetrievedEvent(final Long id, final String transferId, final InternalData data,
      final AbstractBasicOutboundConfiguration basicConfiguration) {
    this.id = id;
    this.transferId = transferId;
    this.data = data;
    this.basicConfiguration = basicConfiguration;
  }

  public String getTransferId() {
    return transferId;
  }

  public InternalData getData() {
    return data;
  }

  public AbstractBasicOutboundConfiguration getBasicConfiguration() {
    return basicConfiguration;
  }

  public Long getId() {
    return id;
  }
}