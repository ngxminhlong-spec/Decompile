package q1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: q1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1955j {

    /* renamed from: a, reason: collision with root package name */
    public static int f14675a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static int f14676b = -1;
    public static int c = -1;
    public static int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static int f14677e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static int f14678f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static int f14679g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static int f14680h = -1;

    /* renamed from: i, reason: collision with root package name */
    public static int f14681i = -1;

    /* renamed from: j, reason: collision with root package name */
    public static int f14682j = -1;

    /* renamed from: k, reason: collision with root package name */
    public static int f14683k = -1;

    /* renamed from: l, reason: collision with root package name */
    public static int f14684l = -1;

    /* renamed from: m, reason: collision with root package name */
    public static int f14685m = -1;

    /* renamed from: n, reason: collision with root package name */
    public static int f14686n = -1;

    /* renamed from: o, reason: collision with root package name */
    public static int f14687o = -1;

    /* renamed from: p, reason: collision with root package name */
    public static int f14688p = -1;

    /* renamed from: q, reason: collision with root package name */
    public static int f14689q = -1;

    /* renamed from: r, reason: collision with root package name */
    public static int f14690r = -1;

    /* renamed from: s, reason: collision with root package name */
    public static int f14691s = -1;

    /* renamed from: t, reason: collision with root package name */
    public static int f14692t = -1;

    /* renamed from: u, reason: collision with root package name */
    public static int f14693u = -1;

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f14694v;

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f14695w;

    /* renamed from: x, reason: collision with root package name */
    public static final SparseArray f14696x;
    public static final SparseArray y;

    /* renamed from: z, reason: collision with root package name */
    public static final SparseArray f14697z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f14694v = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f14695w = sparseIntArray2;
        SparseArray sparseArray = new SparseArray();
        f14696x = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        y = sparseArray2;
        f14697z = new SparseArray();
        sparseIntArray.put(R.id.and_element, 0);
        sparseIntArray.put(R.id.switch_element, 3);
        sparseIntArray.put(R.id.node_element, 4);
        sparseIntArray.put(R.id.path_element, 5);
        sparseIntArray.put(R.id.or_element, 1);
        sparseIntArray.put(R.id.not_element, 6);
        sparseIntArray.put(R.id.nand_element, 8);
        sparseIntArray.put(R.id.nor_element, 9);
        sparseIntArray.put(R.id.xor_element, 7);
        sparseIntArray.put(R.id.xnor_element, 10);
        sparseIntArray.put(R.id.buffer_element, 11);
        sparseIntArray.put(R.id.lamp_element, 12);
        sparseIntArray.put(R.id.color_light_element, 34);
        sparseIntArray.put(R.id.button_element, 13);
        sparseIntArray.put(R.id.and3_element, 14);
        sparseIntArray.put(R.id.nand3_element, 16);
        sparseIntArray.put(R.id.or3_element, 15);
        sparseIntArray.put(R.id.nor3_element, 17);
        sparseIntArray.put(R.id.generator_element_1, 19);
        sparseIntArray.put(R.id.generator_element_1khz, 22);
        sparseIntArray.put(R.id.generator_element_05, 18);
        sparseIntArray.put(R.id.generator_element_40, 20);
        sparseIntArray.put(R.id.generator_element_4khz, 21);
        sparseIntArray.put(R.id.constant_high, 23);
        sparseIntArray.put(R.id.constant_low, 24);
        sparseIntArray.put(R.id.sr_latch, 25);
        sparseIntArray.put(R.id.sr_g_latch, 26);
        sparseIntArray.put(R.id.d_latch, 27);
        sparseIntArray.put(R.id.jk_latch, 28);
        sparseIntArray.put(R.id.t_latch, 29);
        sparseIntArray.put(R.id.sr_ff, 30);
        sparseIntArray.put(R.id.d_ff, 31);
        sparseIntArray.put(R.id.jk_ff, 33);
        sparseIntArray.put(R.id.t_ff, 32);
        sparseIntArray.put(R.id.ic_element, 2);
        sparseIntArray.put(R.id.color_matrix_element, 35);
        sparseIntArray.put(R.id.seven_segment_display_element, 36);
        sparseIntArray.put(R.id.seven_segment_display_decoder_element, 37);
        sparseIntArray.put(R.id.fourteen_segment_display_element, 38);
        sparseIntArray.put(R.id.pla_element, 39);
        sparseIntArray.put(R.id.pal_element, 40);
        sparseIntArray.put(R.id.rom_element, 41);
        sparseIntArray.put(R.id.mux2_element, 42);
        sparseIntArray.put(R.id.demux2_element, 46);
        sparseIntArray.put(R.id.mux4_element, 43);
        sparseIntArray.put(R.id.demux4_element, 47);
        sparseIntArray.put(R.id.mux8_element, 44);
        sparseIntArray.put(R.id.demux8_element, 48);
        sparseIntArray.put(R.id.mux16_element, 45);
        sparseIntArray.put(R.id.demux16_element, 49);
        sparseIntArray.put(R.id.text_element, 50);
        sparseIntArray.put(R.id.tristate_element, 51);
        sparseIntArray.put(R.id.timer_on_element, 52);
        sparseIntArray.put(R.id.timer_off_element, 53);
        sparseIntArray.put(R.id.timer_on_3_element, 522);
        sparseIntArray.put(R.id.timer_off_3_element, 532);
        sparseIntArray.put(R.id.timer_on_10_element, 521);
        sparseIntArray.put(R.id.timer_off_10_element, 531);
        sparseIntArray.put(R.id.proximity_element, 54);
        sparseIntArray.put(R.id.light_sensor_element, 55);
        sparseIntArray.put(R.id.volume_buttons_element, 56);
        sparseIntArray.put(R.id.charger_element, 57);
        sparseIntArray.put(R.id.magnetic_element, 58);
        sparseIntArray.put(R.id.orientation_element, 59);
        sparseIntArray.put(R.id.accelerometer_element, 60);
        sparseIntArray.put(R.id.battery_element, 61);
        sparseIntArray.put(R.id.pressure_sensor_element, 62);
        sparseIntArray.put(R.id.gyroscope_element, 64);
        sparseIntArray.put(R.id.decibel_element, 65);
        sparseIntArray.put(R.id.vibration_element, 66);
        sparseIntArray.put(R.id.speaker_element, 67);
        sparseIntArray.put(R.id.flashlight_element, 68);
        sparseIntArray.put(R.id.zoomer_element, 69);
        sparseIntArray2.put(0, R.string.and);
        sparseIntArray2.put(3, R.string.switch_element);
        sparseIntArray2.put(2, R.string.circuit_element);
        sparseIntArray2.put(4, R.string.node_element);
        sparseIntArray2.put(5, R.string.node_element);
        sparseIntArray2.put(1, R.string.or);
        sparseIntArray2.put(6, R.string.not);
        sparseIntArray2.put(8, R.string.nand);
        sparseIntArray2.put(9, R.string.nor);
        sparseIntArray2.put(11, R.string.buffer);
        sparseIntArray2.put(7, R.string.xor);
        sparseIntArray2.put(10, R.string.xnor);
        sparseIntArray2.put(12, R.string.light);
        sparseIntArray2.put(34, R.string.rgb_led);
        sparseIntArray2.put(35, R.string.led_matrix);
        sparseIntArray2.put(36, R.string.seven_segment_display);
        sparseIntArray2.put(37, R.string.seven_bcd_to_decoder);
        sparseIntArray2.put(38, R.string.fourteen_segment_display_element_name);
        sparseIntArray2.put(13, R.string.button);
        sparseIntArray2.put(14, R.string.and);
        sparseIntArray2.put(16, R.string.nand);
        sparseIntArray2.put(15, R.string.or);
        sparseIntArray2.put(17, R.string.nor);
        sparseIntArray2.put(18, R.string.generator);
        sparseIntArray2.put(19, R.string.generator);
        sparseIntArray2.put(20, R.string.generator);
        sparseIntArray2.put(21, R.string.generator);
        sparseIntArray2.put(22, R.string.generator);
        sparseIntArray2.put(23, R.string.high);
        sparseIntArray2.put(24, R.string.low);
        sparseIntArray2.put(25, R.string.sr_latch);
        sparseIntArray2.put(26, R.string.sr_latch);
        sparseIntArray2.put(27, R.string.d_latch);
        sparseIntArray2.put(28, R.string.jk_latch);
        sparseIntArray2.put(29, R.string.t_latch);
        sparseIntArray2.put(30, R.string.sr_ff);
        sparseIntArray2.put(31, R.string.d_ff);
        sparseIntArray2.put(33, R.string.jk_ff);
        sparseIntArray2.put(32, R.string.t_ff);
        sparseIntArray2.put(39, R.string.pla);
        sparseIntArray2.put(40, R.string.pal);
        sparseIntArray2.put(41, R.string.rom);
        sparseIntArray2.put(42, R.string.mux);
        sparseIntArray2.put(46, R.string.demux);
        sparseIntArray2.put(43, R.string.mux);
        sparseIntArray2.put(47, R.string.demux);
        sparseIntArray2.put(44, R.string.mux);
        sparseIntArray2.put(48, R.string.demux);
        sparseIntArray2.put(45, R.string.mux);
        sparseIntArray2.put(49, R.string.demux);
        sparseIntArray2.put(50, R.string.text);
        sparseIntArray2.put(51, R.string.tristate_buff);
        sparseIntArray2.put(52, R.string.timer_on);
        sparseIntArray2.put(521, R.string.timer_on);
        sparseIntArray2.put(522, R.string.timer_on);
        sparseIntArray2.put(53, R.string.timer_off);
        sparseIntArray2.put(531, R.string.timer_off);
        sparseIntArray2.put(532, R.string.timer_off);
        sparseIntArray2.put(54, R.string.proximity);
        sparseIntArray2.put(55, R.string.light_sensor);
        sparseIntArray2.put(56, R.string.volume_buttons);
        sparseIntArray2.put(57, R.string.charging);
        sparseIntArray2.put(58, R.string.magnetometer);
        sparseIntArray2.put(59, R.string.orientation);
        sparseIntArray2.put(60, R.string.accelerometer);
        sparseIntArray2.put(61, R.string.battery_level);
        sparseIntArray2.put(62, R.string.pressure);
        sparseIntArray2.put(64, R.string.tilt);
        sparseIntArray2.put(65, R.string.decibel_meter);
        sparseIntArray2.put(66, R.string.vibration);
        sparseIntArray2.put(67, R.string.sound);
        sparseIntArray2.put(68, R.string.flashlight);
        sparseIntArray2.put(69, R.string.zoomer);
        sparseIntArray2.put(2, R.string.ic);
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(0, R.drawable.ic_and_draw);
        sparseIntArray3.put(14, R.drawable.ic_and_draw);
        sparseIntArray3.put(1, R.drawable.ic_or_draw);
        sparseIntArray3.put(15, R.drawable.ic_or_draw);
        sparseIntArray3.put(6, R.drawable.ic_not_draw);
        sparseIntArray3.put(8, R.drawable.ic_nand_draw);
        sparseIntArray3.put(16, R.drawable.ic_nand_draw);
        sparseIntArray3.put(9, R.drawable.ic_nor_draw);
        sparseIntArray3.put(17, R.drawable.ic_nor_draw);
        sparseIntArray3.put(7, R.drawable.ic_xor_draw);
        sparseIntArray3.put(10, R.drawable.ic_xnor_draw);
        sparseIntArray3.put(11, R.drawable.ic_buff_draw);
        sparseIntArray3.put(51, R.drawable.ic_buff_draw);
        sparseIntArray3.put(13, R.drawable.ic_switch_draw);
        sparseIntArray3.put(12, R.drawable.ic_lamp_draw);
        sparseIntArray3.put(3, R.drawable.ic_switch_draw);
        sparseIntArray3.put(18, R.drawable.ic_generator_draw);
        sparseIntArray3.put(19, R.drawable.ic_generator_draw);
        sparseIntArray3.put(22, R.drawable.ic_generator_draw);
        sparseIntArray3.put(20, R.drawable.ic_generator_draw);
        sparseIntArray3.put(21, R.drawable.ic_generator_draw);
        sparseIntArray3.put(2, R.drawable.ic_latch_draw);
        sparseIntArray3.put(23, R.drawable.ic_high_constant_draw);
        sparseIntArray3.put(24, R.drawable.ic_low_constant_draw);
        sparseIntArray3.put(25, R.drawable.ic_latch_draw);
        sparseIntArray3.put(26, R.drawable.ic_latch_draw);
        sparseIntArray3.put(27, R.drawable.ic_latch_draw);
        sparseIntArray3.put(28, R.drawable.ic_latch_draw);
        sparseIntArray3.put(29, R.drawable.ic_latch_draw);
        sparseIntArray3.put(33, R.drawable.ic_latch_draw);
        sparseIntArray3.put(32, R.drawable.ic_latch_draw);
        sparseIntArray3.put(31, R.drawable.ic_latch_draw);
        sparseIntArray3.put(30, R.drawable.ic_latch_draw);
        sparseIntArray3.put(34, R.drawable.ic_color_light_draw);
        sparseIntArray3.put(35, R.drawable.ic_color_matrix_draw);
        sparseIntArray3.put(36, R.drawable.ic_color_14_segment_draw);
        sparseIntArray3.put(37, R.drawable.ic_color_matrix_draw);
        sparseIntArray3.put(38, R.drawable.ic_color_14_segment_draw);
        sparseIntArray3.put(39, R.drawable.ic_latch_draw);
        sparseIntArray3.put(40, R.drawable.ic_latch_draw);
        sparseIntArray3.put(41, R.drawable.ic_latch_draw);
        sparseIntArray3.put(52, R.drawable.ic_latch_draw);
        sparseIntArray3.put(53, R.drawable.ic_latch_draw);
        sparseIntArray3.put(54, R.drawable.ic_proximity_draw);
        sparseIntArray3.put(55, R.drawable.ic_light_draw);
        sparseIntArray3.put(56, R.drawable.ic_volume_buttons_draw);
        sparseIntArray3.put(57, R.drawable.ic_charger_sensor_draw);
        sparseIntArray3.put(58, R.drawable.ic_magnetometer_draw);
        sparseIntArray3.put(59, R.drawable.ic_orientation_sensor_draw);
        sparseIntArray3.put(60, R.drawable.ic_accelerometer_sensor_draw);
        sparseIntArray3.put(61, R.drawable.ic_batter_level_draw);
        sparseIntArray3.put(62, R.drawable.ic_pressure_sensor_draw);
        sparseIntArray3.put(64, R.drawable.ic_gyro_sensor_draw);
        sparseIntArray3.put(65, R.drawable.ic_decibel_sensor_draw);
        sparseIntArray3.put(66, R.drawable.ic_vibration_draw);
        sparseIntArray3.put(67, R.drawable.ic_speaker_draw);
        sparseIntArray3.put(68, R.drawable.ic_flash_light_sensor_draw);
        sparseIntArray3.put(69, R.drawable.ic_zoomer_draw);
        sparseArray.put(0, sparseIntArray3);
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        sparseIntArray4.put(0, R.drawable.ic_and_draw_s);
        sparseIntArray4.put(1, R.drawable.ic_or_draw_s);
        sparseIntArray4.put(14, R.drawable.ic_and_draw_s);
        sparseIntArray4.put(15, R.drawable.ic_or_draw_s);
        sparseIntArray4.put(6, R.drawable.ic_not_draw_s);
        sparseIntArray4.put(8, R.drawable.ic_nand_draw_s);
        sparseIntArray4.put(9, R.drawable.ic_nor_draw_s);
        sparseIntArray4.put(16, R.drawable.ic_nand_draw_s);
        sparseIntArray4.put(17, R.drawable.ic_nor_draw_s);
        sparseIntArray4.put(7, R.drawable.ic_xor_draw_s);
        sparseIntArray4.put(10, R.drawable.ic_xnor_draw_s);
        sparseIntArray4.put(11, R.drawable.ic_buff_draw_s);
        sparseIntArray4.put(51, R.drawable.ic_buff_draw_s);
        sparseIntArray4.put(13, R.drawable.ic_switch_draw_s);
        sparseIntArray4.put(12, R.drawable.ic_lamp_draw_s);
        sparseIntArray4.put(3, R.drawable.ic_switch_draw_s);
        sparseIntArray4.put(18, R.drawable.ic_generator_draw_s);
        sparseIntArray4.put(19, R.drawable.ic_generator_draw_s);
        sparseIntArray4.put(22, R.drawable.ic_generator_draw_s);
        sparseIntArray4.put(20, R.drawable.ic_generator_draw_s);
        sparseIntArray4.put(21, R.drawable.ic_generator_draw_s);
        sparseIntArray4.put(2, R.drawable.ic_latch_draw_s);
        sparseIntArray4.put(23, R.drawable.ic_high_constant_draw_s);
        sparseIntArray4.put(24, R.drawable.ic_low_constant_draw_s);
        sparseIntArray4.put(25, R.drawable.ic_latch_draw_s);
        sparseIntArray4.put(26, R.drawable.ic_latch_draw_s);
        sparseIntArray4.put(27, R.drawable.ic_latch_draw_s);
        sparseIntArray4.put(28, R.drawable.ic_latch_draw_s);
        sparseIntArray4.put(29, R.drawable.ic_latch_draw_s);
        sparseIntArray4.put(33, R.drawable.ic_latch_draw_s);
        sparseIntArray4.put(32, R.drawable.ic_latch_draw_s);
        sparseIntArray4.put(31, R.drawable.ic_latch_draw_s);
        sparseIntArray4.put(30, R.drawable.ic_latch_draw_s);
        sparseIntArray4.put(34, R.drawable.ic_color_light_draw_s);
        sparseIntArray4.put(35, R.drawable.ic_color_matrix_draw_s);
        sparseIntArray4.put(36, R.drawable.ic_color_14_segment_draw_s);
        sparseIntArray4.put(37, R.drawable.ic_color_matrix_draw_s);
        sparseIntArray4.put(38, R.drawable.ic_color_14_segment_draw_s);
        sparseIntArray4.put(39, R.drawable.ic_latch_draw_s);
        sparseIntArray4.put(40, R.drawable.ic_latch_draw_s);
        sparseIntArray4.put(41, R.drawable.ic_latch_draw_s);
        sparseIntArray4.put(52, R.drawable.ic_latch_draw_s);
        sparseIntArray4.put(53, R.drawable.ic_latch_draw_s);
        sparseIntArray4.put(54, R.drawable.ic_proximity_draw_s);
        sparseIntArray4.put(55, R.drawable.ic_light_draw_s);
        sparseIntArray4.put(56, R.drawable.ic_volume_buttons_draw_s);
        sparseIntArray4.put(57, R.drawable.ic_charger_sensor_draw_s);
        sparseIntArray4.put(58, R.drawable.ic_magnetometer_draw_s);
        sparseIntArray4.put(59, R.drawable.ic_orientation_sensor_draw_s);
        sparseIntArray4.put(60, R.drawable.ic_accelerometer_sensor_draw_s);
        sparseIntArray4.put(61, R.drawable.ic_batter_level_draw_s);
        sparseIntArray4.put(62, R.drawable.ic_pressure_sensor_draw_s);
        sparseIntArray4.put(64, R.drawable.ic_gyro_sensor_draw_s);
        sparseIntArray4.put(65, R.drawable.ic_decibel_sensor_draw_s);
        sparseIntArray4.put(66, R.drawable.ic_vibration_draw_s);
        sparseIntArray4.put(67, R.drawable.ic_speaker_draw_s);
        sparseIntArray4.put(68, R.drawable.ic_flash_light_sensor_draw_s);
        sparseIntArray4.put(69, R.drawable.ic_zoomer_draw_s);
        sparseArray2.put(0, sparseIntArray4);
    }

    public static Drawable a(Context context, int i4, boolean z4) {
        SparseArray sparseArray = f14697z;
        SparseArray sparseArray2 = (SparseArray) sparseArray.get(0);
        if (sparseArray2 == null) {
            sparseArray2 = new SparseArray();
            sparseArray.put(0, sparseArray2);
        }
        Drawable[] drawableArr = (Drawable[]) sparseArray2.get(i4);
        if (drawableArr == null) {
            drawableArr = new Drawable[2];
            sparseArray2.put(i4, drawableArr);
        }
        Drawable drawable = drawableArr[z4 ? 1 : 0];
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = context.getDrawable(z4 ? ((SparseIntArray) y.get(0)).get(i4) : ((SparseIntArray) f14696x.get(0)).get(i4));
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        if (z4) {
            drawableArr[1] = drawable2;
            return drawable2;
        }
        drawableArr[0] = drawable2;
        return drawable2;
    }
}
