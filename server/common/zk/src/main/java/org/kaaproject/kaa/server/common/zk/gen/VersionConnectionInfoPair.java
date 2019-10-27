/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.common.zk.gen;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class VersionConnectionInfoPair extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"VersionConnectionInfoPair\",\"namespace\":\"org.kaaproject.kaa.server.common.zk.gen\",\"fields\":[{\"name\":\"version\",\"type\":\"int\"},{\"name\":\"conenctionInfo\",\"type\":\"bytes\"}]}");
  private int version;
  private java.nio.ByteBuffer conenctionInfo;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}.
   */
  public VersionConnectionInfoPair() {
  }

  /**
   * All-args constructor.
   */
  public VersionConnectionInfoPair(java.lang.Integer version, java.nio.ByteBuffer conenctionInfo) {
    this.version = version;
    this.conenctionInfo = conenctionInfo;
  }

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  /**
   * Creates a new VersionConnectionInfoPair RecordBuilder
   */
  public static org.kaaproject.kaa.server.common.zk.gen.VersionConnectionInfoPair.Builder newBuilder() {
    return new org.kaaproject.kaa.server.common.zk.gen.VersionConnectionInfoPair.Builder();
  }

  /**
   * Creates a new VersionConnectionInfoPair RecordBuilder by copying an existing Builder
   */
  public static org.kaaproject.kaa.server.common.zk.gen.VersionConnectionInfoPair.Builder newBuilder(org.kaaproject.kaa.server.common.zk.gen.VersionConnectionInfoPair.Builder other) {
    return new org.kaaproject.kaa.server.common.zk.gen.VersionConnectionInfoPair.Builder(other);
  }

  /**
   * Creates a new VersionConnectionInfoPair RecordBuilder by copying an existing
   * VersionConnectionInfoPair instance
   */
  public static org.kaaproject.kaa.server.common.zk.gen.VersionConnectionInfoPair.Builder newBuilder(org.kaaproject.kaa.server.common.zk.gen.VersionConnectionInfoPair other) {
    return new org.kaaproject.kaa.server.common.zk.gen.VersionConnectionInfoPair.Builder(other);
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0:
        return version;
      case 1:
        return conenctionInfo;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0:
        version = (java.lang.Integer) value$;
        break;
      case 1:
        conenctionInfo = (java.nio.ByteBuffer) value$;
        break;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'version' field.
   */
  public java.lang.Integer getVersion() {
    return version;
  }

  /**
   * Sets the value of the 'version' field.
   *
   * @param value the value to set.
   */
  public void setVersion(java.lang.Integer value) {
    this.version = value;
  }

  /**
   * Gets the value of the 'conenctionInfo' field.
   */
  public java.nio.ByteBuffer getConenctionInfo() {
    return conenctionInfo;
  }

  /**
   * Sets the value of the 'conenctionInfo' field.
   *
   * @param value the value to set.
   */
  public void setConenctionInfo(java.nio.ByteBuffer value) {
    this.conenctionInfo = value;
  }

  /**
   * RecordBuilder for VersionConnectionInfoPair instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<VersionConnectionInfoPair>
      implements org.apache.avro.data.RecordBuilder<VersionConnectionInfoPair> {

    private int version;
    private java.nio.ByteBuffer conenctionInfo;

    /**
     * Creates a new Builder
     */
    private Builder() {
      super(org.kaaproject.kaa.server.common.zk.gen.VersionConnectionInfoPair.SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder
     */
    private Builder(org.kaaproject.kaa.server.common.zk.gen.VersionConnectionInfoPair.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.version)) {
        this.version = data().deepCopy(fields()[0].schema(), other.version);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.conenctionInfo)) {
        this.conenctionInfo = data().deepCopy(fields()[1].schema(), other.conenctionInfo);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing VersionConnectionInfoPair instance
     */
    private Builder(org.kaaproject.kaa.server.common.zk.gen.VersionConnectionInfoPair other) {
      super(org.kaaproject.kaa.server.common.zk.gen.VersionConnectionInfoPair.SCHEMA$);
      if (isValidValue(fields()[0], other.version)) {
        this.version = data().deepCopy(fields()[0].schema(), other.version);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.conenctionInfo)) {
        this.conenctionInfo = data().deepCopy(fields()[1].schema(), other.conenctionInfo);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Gets the value of the 'version' field
     */
    public java.lang.Integer getVersion() {
      return version;
    }

    /**
     * Sets the value of the 'version' field
     */
    public org.kaaproject.kaa.server.common.zk.gen.VersionConnectionInfoPair.Builder setVersion(int value) {
      validate(fields()[0], value);
      this.version = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
     * Checks whether the 'version' field has been set
     */
    public boolean hasVersion() {
      return fieldSetFlags()[0];
    }

    /**
     * Clears the value of the 'version' field
     */
    public org.kaaproject.kaa.server.common.zk.gen.VersionConnectionInfoPair.Builder clearVersion() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
     * Gets the value of the 'conenctionInfo' field
     */
    public java.nio.ByteBuffer getConenctionInfo() {
      return conenctionInfo;
    }

    /**
     * Sets the value of the 'conenctionInfo' field
     */
    public org.kaaproject.kaa.server.common.zk.gen.VersionConnectionInfoPair.Builder setConenctionInfo(java.nio.ByteBuffer value) {
      validate(fields()[1], value);
      this.conenctionInfo = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
     * Checks whether the 'conenctionInfo' field has been set
     */
    public boolean hasConenctionInfo() {
      return fieldSetFlags()[1];
    }

    /**
     * Clears the value of the 'conenctionInfo' field
     */
    public org.kaaproject.kaa.server.common.zk.gen.VersionConnectionInfoPair.Builder clearConenctionInfo() {
      conenctionInfo = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public VersionConnectionInfoPair build() {
      try {
        VersionConnectionInfoPair record = new VersionConnectionInfoPair();
        record.version = fieldSetFlags()[0] ? this.version : (java.lang.Integer) defaultValue(fields()[0]);
        record.conenctionInfo = fieldSetFlags()[1] ? this.conenctionInfo : (java.nio.ByteBuffer) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
