// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: party-routing-profile-model.proto

package org.bian.protobuf.partyroutingprofile;

public final class PartyRoutingProfileModel {
  private PartyRoutingProfileModel() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_bian_protobuf_partyroutingprofile_PartyRoutingStateList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_bian_protobuf_partyroutingprofile_PartyRoutingStateList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_bian_protobuf_partyroutingprofile_PartyRoutingState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_bian_protobuf_partyroutingprofile_PartyRoutingState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!party-routing-profile-model.proto\022%org" +
      ".bian.protobuf.partyroutingprofile\"m\n\025Pa" +
      "rtyRoutingStateList\022T\n\022partyRoutingState" +
      "s\030\001 \003(\01328.org.bian.protobuf.partyrouting" +
      "profile.PartyRoutingState\"C\n\021PartyRoutin" +
      "gState\022\033\n\023customerOfferStatus\030\001 \001(\t\022\021\n\tp" +
      "rocessId\030\002 \001(\tB)\n%org.bian.protobuf.part" +
      "yroutingprofileP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_bian_protobuf_partyroutingprofile_PartyRoutingStateList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_bian_protobuf_partyroutingprofile_PartyRoutingStateList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_bian_protobuf_partyroutingprofile_PartyRoutingStateList_descriptor,
        new java.lang.String[] { "PartyRoutingStates", });
    internal_static_org_bian_protobuf_partyroutingprofile_PartyRoutingState_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_bian_protobuf_partyroutingprofile_PartyRoutingState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_bian_protobuf_partyroutingprofile_PartyRoutingState_descriptor,
        new java.lang.String[] { "CustomerOfferStatus", "ProcessId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
