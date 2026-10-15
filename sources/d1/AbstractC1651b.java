package d1;

import android.view.View;
import android.view.ViewGroup;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import d3.AbstractC1654b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: d1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1651b {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f12599a;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f12599a = linkedHashMap;
        linkedHashMap.put(0, new C1650a(R.drawable.ic_and, R.string.and_gate_title, R.layout.learn_and, R.string.learn_and_desc));
        linkedHashMap.put(1, new C1650a(R.drawable.ic_or, R.string.or_gate_title, R.layout.learn_or, R.string.learn_or_desc));
        linkedHashMap.put(7, new C1650a(R.drawable.ic_xor, R.string.xor_gate_title, R.layout.learn_xor, R.string.learn_xor_desc));
        linkedHashMap.put(6, new C1650a(R.drawable.ic_not, R.string.not_gate_title, R.layout.learn_not, R.string.learn_not_desc));
        linkedHashMap.put(8, new C1650a(R.drawable.ic_nand, R.string.nand_gate_title, R.layout.learn_nand, R.string.learn_nand_desc));
        linkedHashMap.put(9, new C1650a(R.drawable.ic_nor, R.string.nor_gate_title, R.layout.learn_nor, R.string.learn_nor_desc));
        linkedHashMap.put(10, new C1650a(R.drawable.ic_xnor, R.string.xnor_gate_title, R.layout.learn_xnor, R.string.learn_xnor_desc));
        linkedHashMap.put(11, new C1650a(R.drawable.ic_buf, R.string.buffer_gate_title, R.layout.learn_buffer, R.string.learn_buffer_desc));
        linkedHashMap.put(14, new C1650a(R.drawable.ic_3and, R.string.and_gate_title, R.layout.learn_and3, R.string.learn_and_desc));
        linkedHashMap.put(15, new C1650a(R.drawable.ic_3or, R.string.or_gate_title, R.layout.learn_or3, R.string.learn_or_desc));
        linkedHashMap.put(16, new C1650a(R.drawable.ic_3nand, R.string.nand_gate_title, R.layout.learn_nand3, R.string.learn_nand_desc));
        linkedHashMap.put(17, new C1650a(R.drawable.ic_3nor, R.string.nor_gate_title, R.layout.learn_nor3, R.string.learn_nor_desc));
        linkedHashMap.put(3, new C1650a(R.drawable.ic_switch, R.string.switch_gate_title, R.layout.learn_switch, R.string.learn_switch_desc));
        linkedHashMap.put(13, new C1650a(R.drawable.ic_button, R.string.button_gate_title, R.layout.learn_button, R.string.learn_button_desc));
        linkedHashMap.put(12, new C1650a(R.drawable.ic_light_element, R.string.light_gate_title, R.layout.learn_light, R.string.learn_light_desc));
        linkedHashMap.put(18, new C1650a(R.drawable.ic_pulse, R.string.generator_gate_title, R.layout.learn_generator, R.string.learn_genrator_desc));
        linkedHashMap.put(19, new C1650a(R.drawable.ic_pulse, R.string.generator_gate_title, R.layout.learn_generator, R.string.learn_genrator_desc));
        linkedHashMap.put(20, new C1650a(R.drawable.ic_pulse, R.string.generator_gate_title, R.layout.learn_generator, R.string.learn_genrator_desc));
        linkedHashMap.put(21, new C1650a(R.drawable.ic_pulse, R.string.generator_gate_title, R.layout.learn_generator, R.string.learn_genrator_desc));
        linkedHashMap.put(22, new C1650a(R.drawable.ic_pulse, R.string.generator_gate_title, R.layout.learn_generator, R.string.learn_genrator_desc));
        linkedHashMap.put(23, new C1650a(R.drawable.ic_high_constant_elment, R.string.high_constant, R.layout.learn_high, R.string.logical_constant));
        linkedHashMap.put(24, new C1650a(R.drawable.ic_low_constant_element, R.string.low_constant, R.layout.learn_low, R.string.logical_constant));
        linkedHashMap.put(25, new C1650a(R.drawable.ic_srlatch_elem, R.string.sr_latch, R.layout.learn_sr_latch, R.string.sr_l_desc));
        linkedHashMap.put(26, new C1650a(R.drawable.ic_srgatedlatch, R.string.sr_gated, R.layout.learn_sr_g_latch, R.string.sr_g_l_desc));
        linkedHashMap.put(27, new C1650a(R.drawable.ic_dlatch_elem, R.string.d_latch, R.layout.learn_d_latch, R.string.d_l_desc));
        linkedHashMap.put(28, new C1650a(R.drawable.ic_jklatch_elem, R.string.jk_latch, R.layout.learn_jk_latch, R.string.jk_l_desc));
        linkedHashMap.put(29, new C1650a(R.drawable.ic_tlatch_elem, R.string.t_latch, R.layout.learn_t_latch, R.string.t_l_desc));
        linkedHashMap.put(30, new C1650a(R.drawable.ic_srff_elem, R.string.sr_ff, R.layout.learn_sr_ff, R.string.sr_ff_desc));
        linkedHashMap.put(31, new C1650a(R.drawable.ic_dff_elem, R.string.d_ff, R.layout.learn_d_ff, R.string.d_ff_desc));
        linkedHashMap.put(33, new C1650a(R.drawable.ic_jkff_elem, R.string.jk_ff, R.layout.learn_jk_ff, R.string.jk_ff_desc));
        linkedHashMap.put(32, new C1650a(R.drawable.ic_tff_elem, R.string.t_ff, R.layout.learn_t_ff, R.string.t_ff_desc));
        linkedHashMap.put(34, new C1650a(R.drawable.ic_color_light_element, R.string.rgb_led, R.layout.learn_color_light, R.string.rgb_led_desc));
        linkedHashMap.put(35, new C1650a(R.drawable.ic_led_matrix_element, R.string.led_matrix, R.layout.learn_color_matrix, R.string.led_matrix_desc));
        linkedHashMap.put(38, new C1650a(R.drawable.ic_14_segment_element, R.string.fourteen_segment_display, R.layout.learn_14_segment, R.string.segment_display));
        linkedHashMap.put(36, new C1650a(R.drawable.ic_7_segment_element, R.string.seven_segment_display, R.layout.learn_7_segment, R.string.segment_display));
        linkedHashMap.put(37, new C1650a(R.drawable.ic_bcd_to_7_element, R.string.seven_bcd_to_segment_decoder, R.layout.learn_bcd_to_7segement, R.string.decoder));
        linkedHashMap.put(39, new C1650a(R.drawable.ic_progrmabble_pla, R.string.pla, R.layout.pla_setup, R.string.pla_desc));
        linkedHashMap.put(40, new C1650a(R.drawable.ic_pal_element, R.string.pal, R.layout.pal_setup, R.string.pla_desc));
        linkedHashMap.put(41, new C1650a(R.drawable.ic_rom_element, R.string.rom, R.layout.rom_setup, R.string.programmable_prom));
        linkedHashMap.put(42, new C1650a(R.drawable.ic_mux_element, R.string.mux, R.layout.learn_mux, R.string.data_selector));
        linkedHashMap.put(43, new C1650a(R.drawable.ic_mux_element, R.string.mux, R.layout.learn_mux, R.string.data_selector));
        linkedHashMap.put(44, new C1650a(R.drawable.ic_mux_element, R.string.mux, R.layout.learn_mux, R.string.data_selector));
        linkedHashMap.put(45, new C1650a(R.drawable.ic_mux_element, R.string.mux, R.layout.learn_mux, R.string.data_selector));
        linkedHashMap.put(46, new C1650a(R.drawable.ic_demux_element, R.string.demux, R.layout.learn_demux, R.string.data_distributor));
        linkedHashMap.put(47, new C1650a(R.drawable.ic_demux_element, R.string.demux, R.layout.learn_demux, R.string.data_distributor));
        linkedHashMap.put(48, new C1650a(R.drawable.ic_demux_element, R.string.demux, R.layout.learn_demux, R.string.data_distributor));
        linkedHashMap.put(49, new C1650a(R.drawable.ic_demux_element, R.string.demux, R.layout.learn_demux, R.string.data_distributor));
        linkedHashMap.put(50, new C1650a(R.drawable.ic_text_element, R.string.text, R.layout.setup_text, R.string.text));
        linkedHashMap.put(51, new C1650a(R.drawable.ic_tri_state_buff_element, R.string.tristate_buff, R.layout.learn_tristate, R.string.tri_state_element));
        linkedHashMap.put(52, new C1650a(R.drawable.ic_timer_element_on, R.string.timer, R.layout.setup_timer, R.string.delayer));
        linkedHashMap.put(53, new C1650a(R.drawable.ic_timer_element_on, R.string.timer, R.layout.setup_timer, R.string.delayer));
        linkedHashMap.put(2, new C1650a(R.drawable.ic_ic_setup, R.string.integrated_circuit, R.layout.learn_ic, R.string.ic));
        C1650a c1650a = new C1650a(R.drawable.ic_magnetic_element, R.string.devices, R.layout.learn_sensors, R.string.interactive);
        linkedHashMap.put(54, c1650a);
        linkedHashMap.put(55, c1650a);
        linkedHashMap.put(56, c1650a);
        linkedHashMap.put(57, c1650a);
        linkedHashMap.put(58, c1650a);
        linkedHashMap.put(59, c1650a);
        linkedHashMap.put(60, c1650a);
        linkedHashMap.put(61, c1650a);
        linkedHashMap.put(62, c1650a);
        linkedHashMap.put(64, c1650a);
        linkedHashMap.put(65, c1650a);
        linkedHashMap.put(66, c1650a);
        linkedHashMap.put(67, c1650a);
        linkedHashMap.put(68, c1650a);
        linkedHashMap.put(69, c1650a);
    }

    public static int a(int i4) {
        return ((C1650a) f12599a.get(Integer.valueOf(i4))).f12597a;
    }

    public static ArrayList b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : f12599a.entrySet()) {
            if (((Integer) entry.getKey()).intValue() != 19 && ((Integer) entry.getKey()).intValue() != 20 && ((Integer) entry.getKey()).intValue() != 21 && ((Integer) entry.getKey()).intValue() != 22 && ((Integer) entry.getKey()).intValue() != 43 && ((Integer) entry.getKey()).intValue() != 44 && ((Integer) entry.getKey()).intValue() != 45 && ((Integer) entry.getKey()).intValue() != 47 && ((Integer) entry.getKey()).intValue() != 48 && ((Integer) entry.getKey()).intValue() != 49 && ((Integer) entry.getKey()).intValue() != 50 && ((Integer) entry.getKey()).intValue() != 522 && ((Integer) entry.getKey()).intValue() != 521 && ((Integer) entry.getKey()).intValue() != 53 && ((Integer) entry.getKey()).intValue() != 532 && ((Integer) entry.getKey()).intValue() != 531 && ((Integer) entry.getKey()).intValue() != 55 && ((Integer) entry.getKey()).intValue() != 56 && ((Integer) entry.getKey()).intValue() != 57 && ((Integer) entry.getKey()).intValue() != 58 && ((Integer) entry.getKey()).intValue() != 59 && ((Integer) entry.getKey()).intValue() != 60 && ((Integer) entry.getKey()).intValue() != 61 && ((Integer) entry.getKey()).intValue() != 62 && ((Integer) entry.getKey()).intValue() != 64 && ((Integer) entry.getKey()).intValue() != 65 && ((Integer) entry.getKey()).intValue() != 66 && ((Integer) entry.getKey()).intValue() != 67 && ((Integer) entry.getKey()).intValue() != 68 && ((Integer) entry.getKey()).intValue() != 69) {
                arrayList.add((C1650a) entry.getValue());
            }
        }
        return arrayList;
    }

    public static View c(ViewGroup viewGroup, int i4) {
        return AbstractC1654b.B(viewGroup, (C1650a) f12599a.get(Integer.valueOf(i4)));
    }
}
