// automatically generated, do not modify

package grl.flatbuffer;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class KUKAiiwaArmConfiguration extends Table {
  public static KUKAiiwaArmConfiguration getRootAsKUKAiiwaArmConfiguration(ByteBuffer _bb) { return getRootAsKUKAiiwaArmConfiguration(_bb, new KUKAiiwaArmConfiguration()); }
  public static KUKAiiwaArmConfiguration getRootAsKUKAiiwaArmConfiguration(ByteBuffer _bb, KUKAiiwaArmConfiguration obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public KUKAiiwaArmConfiguration __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  /**
   * how commands will be sent to robot
   */
  public byte commandInterface() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) : 0; }
  /**
   * how robot state will be sent to driver
   */
  public byte monitorInterface() { int o = __offset(8); return o != 0 ? bb.get(o + bb_pos) : 0; }
  /**
   * motion command mode: cartesian, wrench, torque commands
   */
  public byte clientCommandMode() { int o = __offset(10); return o != 0 ? bb.get(o + bb_pos) : 0; }
  /**
   * The type of commands FRI will use: cartesian, joint
   */
  public byte overlayType() { int o = __offset(12); return o != 0 ? bb.get(o + bb_pos) : 0; }
  /**
   * position, cartesian impedence, or joint impedence low level controller adjustments
   */
  public byte controlMode() { int o = __offset(14); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public CartesianImpedenceControlMode setCartImpedance() { return setCartImpedance(new CartesianImpedenceControlMode()); }
  public CartesianImpedenceControlMode setCartImpedance(CartesianImpedenceControlMode obj) { int o = __offset(16); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }
  public JointImpedenceControlMode setJointImpedance() { return setJointImpedance(new JointImpedenceControlMode()); }
  public JointImpedenceControlMode setJointImpedance(JointImpedenceControlMode obj) { int o = __offset(18); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }
  public SmartServo smartServoConfig() { return smartServoConfig(new SmartServo()); }
  public SmartServo smartServoConfig(SmartServo obj) { int o = __offset(20); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }
  public FRI FRIConfig() { return FRIConfig(new FRI()); }
  public FRI FRIConfig(FRI obj) { int o = __offset(22); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }
  public grl.flatbuffer.LinkObject tools(int j) { return tools(new grl.flatbuffer.LinkObject(), j); }
  public grl.flatbuffer.LinkObject tools(grl.flatbuffer.LinkObject obj, int j) { int o = __offset(24); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int toolsLength() { int o = __offset(24); return o != 0 ? __vector_len(o) : 0; }
  /**
   * set kuka tablet "processData" panel UI config strings
   */
  public ProcessData processData(int j) { return processData(new ProcessData(), j); }
  public ProcessData processData(ProcessData obj, int j) { int o = __offset(26); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int processDataLength() { int o = __offset(26); return o != 0 ? __vector_len(o) : 0; }
  public String currentMotionCenter() { int o = __offset(28); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer currentMotionCenterAsByteBuffer() { return __vector_as_bytebuffer(28, 1); }
  public boolean requestMonitorProcessData() { int o = __offset(30); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createKUKAiiwaArmConfiguration(FlatBufferBuilder builder,
      int nameOffset,
      byte commandInterface,
      byte monitorInterface,
      byte clientCommandMode,
      byte overlayType,
      byte controlMode,
      int setCartImpedanceOffset,
      int setJointImpedanceOffset,
      int smartServoConfigOffset,
      int FRIConfigOffset,
      int toolsOffset,
      int processDataOffset,
      int currentMotionCenterOffset,
      boolean requestMonitorProcessData) {
    builder.startObject(14);
    KUKAiiwaArmConfiguration.addCurrentMotionCenter(builder, currentMotionCenterOffset);
    KUKAiiwaArmConfiguration.addProcessData(builder, processDataOffset);
    KUKAiiwaArmConfiguration.addTools(builder, toolsOffset);
    KUKAiiwaArmConfiguration.addFRIConfig(builder, FRIConfigOffset);
    KUKAiiwaArmConfiguration.addSmartServoConfig(builder, smartServoConfigOffset);
    KUKAiiwaArmConfiguration.addSetJointImpedance(builder, setJointImpedanceOffset);
    KUKAiiwaArmConfiguration.addSetCartImpedance(builder, setCartImpedanceOffset);
    KUKAiiwaArmConfiguration.addName(builder, nameOffset);
    KUKAiiwaArmConfiguration.addRequestMonitorProcessData(builder, requestMonitorProcessData);
    KUKAiiwaArmConfiguration.addControlMode(builder, controlMode);
    KUKAiiwaArmConfiguration.addOverlayType(builder, overlayType);
    KUKAiiwaArmConfiguration.addClientCommandMode(builder, clientCommandMode);
    KUKAiiwaArmConfiguration.addMonitorInterface(builder, monitorInterface);
    KUKAiiwaArmConfiguration.addCommandInterface(builder, commandInterface);
    return KUKAiiwaArmConfiguration.endKUKAiiwaArmConfiguration(builder);
  }

  public static void startKUKAiiwaArmConfiguration(FlatBufferBuilder builder) { builder.startObject(14); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addCommandInterface(FlatBufferBuilder builder, byte commandInterface) { builder.addByte(1, commandInterface, 0); }
  public static void addMonitorInterface(FlatBufferBuilder builder, byte monitorInterface) { builder.addByte(2, monitorInterface, 0); }
  public static void addClientCommandMode(FlatBufferBuilder builder, byte clientCommandMode) { builder.addByte(3, clientCommandMode, 0); }
  public static void addOverlayType(FlatBufferBuilder builder, byte overlayType) { builder.addByte(4, overlayType, 0); }
  public static void addControlMode(FlatBufferBuilder builder, byte controlMode) { builder.addByte(5, controlMode, 0); }
  public static void addSetCartImpedance(FlatBufferBuilder builder, int setCartImpedanceOffset) { builder.addOffset(6, setCartImpedanceOffset, 0); }
  public static void addSetJointImpedance(FlatBufferBuilder builder, int setJointImpedanceOffset) { builder.addOffset(7, setJointImpedanceOffset, 0); }
  public static void addSmartServoConfig(FlatBufferBuilder builder, int smartServoConfigOffset) { builder.addOffset(8, smartServoConfigOffset, 0); }
  public static void addFRIConfig(FlatBufferBuilder builder, int FRIConfigOffset) { builder.addOffset(9, FRIConfigOffset, 0); }
  public static void addTools(FlatBufferBuilder builder, int toolsOffset) { builder.addOffset(10, toolsOffset, 0); }
  public static int createToolsVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startToolsVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addProcessData(FlatBufferBuilder builder, int processDataOffset) { builder.addOffset(11, processDataOffset, 0); }
  public static int createProcessDataVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startProcessDataVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addCurrentMotionCenter(FlatBufferBuilder builder, int currentMotionCenterOffset) { builder.addOffset(12, currentMotionCenterOffset, 0); }
  public static void addRequestMonitorProcessData(FlatBufferBuilder builder, boolean requestMonitorProcessData) { builder.addBoolean(13, requestMonitorProcessData, false); }
  public static int endKUKAiiwaArmConfiguration(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

