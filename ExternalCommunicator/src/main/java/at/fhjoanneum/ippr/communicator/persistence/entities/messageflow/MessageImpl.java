package at.fhjoanneum.ippr.communicator.persistence.entities.messageflow;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.validator.constraints.NotBlank;

import com.google.common.base.Preconditions;

import at.fhjoanneum.ippr.communicator.persistence.objects.messageflow.Message;

@Entity(name = "MESSAGE")
public class MessageImpl implements Serializable, Message {

  private static final long serialVersionUID = 6655111821383189265L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @NotBlank
  @Column
  private String transferId;

  @Column
  @Lob
  private String internalData;

  @Column
  @Lob
  private String externalData;

  MessageImpl() {}

  MessageImpl(final String transferId) {
    this.transferId = transferId;
  }

  @Override
  public void setInternalData(final String data) {
    Preconditions.checkNotNull(data);
    this.internalData = data;
  }

  @Override
  public void setExternalData(final String data) {
    Preconditions.checkNotNull(data);
    this.externalData = data;
  }

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public String getTransferId() {
    return transferId;
  }

  @Override
  public String getInternalData() {
    return internalData;
  }

  @Override
  public String getExternalData() {
    return externalData;
  }

  @Override
  public String toString() {
    return "Message [id=" + id + ", transferId=" + transferId + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final MessageImpl other = (MessageImpl) obj;
    if (id == null) {
      if (other.id != null) {
        return false;
      }
    } else if (!id.equals(other.id)) {
      return false;
    }
    return true;
  }
}