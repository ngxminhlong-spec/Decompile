package h1;

import A2.o;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import b1.C0214a;
import b1.C0217d;
import b1.e;
import b1.f;
import b1.g;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import com.google.android.gms.internal.ads.C0258Da;
import com.google.android.gms.internal.ads.C0783ji;
import j1.c;
import java.util.ArrayList;
import java.util.UUID;
import p1.AbstractC1906D;
import p1.C1904B;
import p1.C1905C;
import p1.C1907E;
import p1.C1908F;
import p1.C1909G;
import p1.C1910H;
import p1.C1916b;
import p1.C1918d;
import p1.C1921g;
import p1.C1923i;
import p1.C1924j;
import p1.C1927m;
import p1.C1928n;
import p1.C1929o;
import p1.C1930p;
import p1.C1932s;
import p1.C1934u;
import p1.C1939z;
import p1.P;
import p1.Q;
import p1.S;
import p1.T;
import p1.V;
import p1.X;
import p1.Z;
import p1.a0;
import p1.b0;
import p1.c0;
import p1.d0;
import p1.f0;
import p1.g0;
import p1.i0;
import p1.j0;
import p1.l0;
import p1.r;
import q1.AbstractC1955j;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1698a {

    /* renamed from: A, reason: collision with root package name */
    public final long f13117A;

    /* renamed from: B, reason: collision with root package name */
    public final C1995b f13118B;

    /* renamed from: C, reason: collision with root package name */
    public final e f13119C;

    /* renamed from: D, reason: collision with root package name */
    public final String f13120D = UUID.randomUUID().toString();

    /* renamed from: E, reason: collision with root package name */
    public int f13121E = 0;

    /* renamed from: o, reason: collision with root package name */
    public float f13122o;

    /* renamed from: p, reason: collision with root package name */
    public float f13123p;

    /* renamed from: q, reason: collision with root package name */
    public float f13124q;

    /* renamed from: r, reason: collision with root package name */
    public float f13125r;

    /* renamed from: s, reason: collision with root package name */
    public float f13126s;

    /* renamed from: t, reason: collision with root package name */
    public float f13127t;

    /* renamed from: u, reason: collision with root package name */
    public int f13128u;

    /* renamed from: v, reason: collision with root package name */
    public int f13129v;

    /* renamed from: w, reason: collision with root package name */
    public int f13130w;

    /* renamed from: x, reason: collision with root package name */
    public int f13131x;
    public String y;

    /* renamed from: z, reason: collision with root package name */
    public String f13132z;

    /* JADX WARN: Type inference failed for: r8v45, types: [java.lang.Object, B0.q] */
    /* JADX WARN: Type inference failed for: r8v47, types: [b1.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v58, types: [b1.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v60, types: [java.lang.Object, b1.b] */
    public AbstractC1698a(long j4, float f4, float f5, C1995b c1995b) {
        e eVar;
        g gVar;
        this.f13117A = j4;
        this.f13122o = f4;
        this.f13123p = f5;
        int i4 = AbstractC1955j.f14675a;
        this.f13130w = i4;
        this.f13128u = i4;
        this.f13129v = i4;
        this.f13131x = i4;
        this.f13118B = c1995b;
        int r4 = r();
        this.y = ((BoardView) c1995b.f14883r).getContext().getString(AbstractC1955j.f14695w.get(r4)) + " " + j4;
        Context context = ((BoardView) c1995b.f14883r).getContext();
        if (this instanceof b0) {
            C0217d c0217d = new C0217d(2);
            c0217d.f3471s = (b0) this;
            c0217d.f3468p = context.getDrawable(R.drawable.ic_switch_state_icon_on);
            c0217d.f3469q = context.getDrawable(R.drawable.ic_switch_state_icon_off);
            c0217d.f3470r = r9.getIntrinsicWidth() / r9.getIntrinsicHeight();
            eVar = c0217d;
        } else if (this instanceof C1921g) {
            C0217d c0217d2 = new C0217d(0);
            c0217d2.f3471s = (C1921g) this;
            c0217d2.f3468p = context.getDrawable(R.drawable.ic_button_state_on);
            c0217d2.f3469q = context.getDrawable(R.drawable.ic_button_state_off);
            c0217d2.f3470r = r9.getIntrinsicWidth() / r9.getIntrinsicHeight();
            eVar = c0217d2;
        } else if (this instanceof C1907E) {
            C0258Da c0258Da = new C0258Da(10, false);
            c0258Da.f4618p = (C1907E) this;
            c0258Da.f4619q = context.getDrawable(R.drawable.lamp_light);
            eVar = c0258Da;
        } else if (this instanceof C1923i) {
            q2.e eVar2 = new q2.e(9, false);
            eVar2.f14709p = (C1923i) this;
            eVar2.f14710q = context.getDrawable(R.drawable.color_light_light).mutate();
            Paint paint = new Paint();
            eVar2.f14711r = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            eVar = eVar2;
        } else if (this instanceof C1924j) {
            H1.a aVar = new H1.a(3);
            aVar.f856q = (C1924j) this;
            Paint paint2 = new Paint();
            aVar.f857r = paint2;
            Paint.Style style = Paint.Style.FILL_AND_STROKE;
            paint2.setStyle(style);
            aVar.f855p = AbstractC1955j.f14680h;
            Paint paint3 = new Paint();
            aVar.f858s = paint3;
            paint3.setStyle(style);
            paint3.setColor(context.getResources().getColor(R.color.segment_display_inactive));
            eVar = aVar;
        } else if (this instanceof Z) {
            f fVar = new f(1);
            fVar.f3479v = (Z) this;
            fVar.f3473p = context.getDrawable(R.drawable.ic_segment_display_horizontal);
            fVar.f3476s = context.getDrawable(R.drawable.ic_segment_display_vertical);
            fVar.f3475r = r9.getIntrinsicWidth() / r9.getIntrinsicHeight();
            fVar.f3474q = context.getDrawable(R.drawable.ic_segment_display_horizontal_active);
            fVar.f3477t = context.getDrawable(R.drawable.ic_segment_display_vertical_active);
            eVar = fVar;
        } else if (this instanceof r) {
            ?? obj = new Object();
            obj.f3458p = (r) this;
            obj.f3459q = context.getDrawable(R.drawable.ic_bcdto7dispaly_drawable);
            obj.f3457o = r9.getIntrinsicWidth() / r9.getIntrinsicHeight();
            eVar = obj;
        } else if (this instanceof C1934u) {
            f fVar2 = new f(0);
            fVar2.f3479v = (C1934u) this;
            fVar2.f3473p = context.getDrawable(R.drawable.ic_segment_display_horizontal);
            fVar2.f3476s = context.getDrawable(R.drawable.ic_segment_display_vertical);
            fVar2.f3475r = r9.getIntrinsicWidth() / r9.getIntrinsicHeight();
            fVar2.f3474q = context.getDrawable(R.drawable.ic_segment_display_horizontal_active);
            fVar2.f3477t = context.getDrawable(R.drawable.ic_segment_display_vertical_active);
            eVar = fVar2;
        } else if (this instanceof i0) {
            ?? obj2 = new Object();
            obj2.f3486o = (i0) this;
            Paint paint4 = new Paint();
            obj2.f3487p = paint4;
            paint4.setStyle(Paint.Style.STROKE);
            paint4.setStrokeCap(Paint.Cap.ROUND);
            paint4.setStrokeWidth(AbstractC1955j.c);
            obj2.f3488q = context.getDrawable(R.drawable.ic_timer_tick);
            obj2.f3489r = r10.getIntrinsicWidth() / r10.getIntrinsicHeight();
            obj2.f3490s = !(r9 instanceof g0);
            eVar = obj2;
        } else if (this instanceof C1916b) {
            C0214a c0214a = new C0214a(0);
            c0214a.f3455s = (C1916b) this;
            c0214a.f3452p = context.getDrawable(R.drawable.ic_accelerometer_ball);
            c0214a.f3453q = r9.getIntrinsicWidth() / r9.getIntrinsicHeight();
            c0214a.f3454r = context.getResources().getConfiguration().getLayoutDirection() == 1;
            eVar = c0214a;
        } else if (this instanceof C1939z) {
            C0217d c0217d3 = new C0217d(1);
            c0217d3.f3471s = (C1939z) this;
            Paint paint5 = new Paint();
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeCap(Paint.Cap.ROUND);
            paint5.setStrokeWidth(AbstractC1955j.c);
            c0217d3.f3468p = context.getDrawable(R.drawable.pulse_state_on);
            c0217d3.f3469q = context.getDrawable(R.drawable.pulse_state_off);
            c0217d3.f3470r = r9.getIntrinsicWidth() / r9.getIntrinsicHeight();
            eVar = c0217d3;
        } else if (this instanceof P) {
            q2.e eVar3 = new q2.e(11, false);
            eVar3.f14709p = (P) this;
            Paint paint6 = new Paint();
            eVar3.f14710q = paint6;
            Paint.Style style2 = Paint.Style.FILL_AND_STROKE;
            paint6.setStyle(style2);
            paint6.setColor(AbstractC1955j.f14680h);
            Paint paint7 = new Paint();
            paint7.setStyle(style2);
            paint7.setColor(AbstractC1955j.f14692t);
            Paint paint8 = new Paint();
            eVar3.f14711r = paint8;
            paint8.setStyle(Paint.Style.STROKE);
            paint8.setColor(context.getResources().getColor(R.color.segment_display_inactive));
            eVar = eVar3;
        } else if (this instanceof C1909G) {
            H1.a aVar2 = new H1.a(5);
            aVar2.f855p = -1;
            aVar2.f856q = (C1909G) this;
            Paint paint9 = new Paint();
            aVar2.f857r = paint9;
            paint9.setStyle(Paint.Style.STROKE);
            paint9.setStrokeWidth(AbstractC1955j.c);
            aVar2.f858s = context.getDrawable(R.drawable.color_light_light_learn).mutate();
            paint9.setStrokeCap(Paint.Cap.ROUND);
            eVar = aVar2;
        } else if (this instanceof C1929o) {
            H1.a aVar3 = new H1.a(4);
            aVar3.f855p = -1;
            aVar3.f856q = (C1929o) this;
            Paint paint10 = new Paint();
            aVar3.f857r = paint10;
            paint10.setStyle(Paint.Style.STROKE);
            paint10.setStrokeWidth(AbstractC1955j.c);
            aVar3.f858s = context.getDrawable(R.drawable.color_light_light_learn).mutate();
            paint10.setStrokeCap(Paint.Cap.ROUND);
            eVar = aVar3;
        } else {
            if ((this instanceof X) && !(this instanceof V)) {
                gVar = new g(context, (AbstractC1906D) this, R.drawable.ic_sr_latch_name, R.drawable.ic_sr_latch_name_active, R.drawable.ic_latch_name);
            } else if (this instanceof C1928n) {
                gVar = new g(context, (AbstractC1906D) this, R.drawable.ic_d_latch_name, R.drawable.ic_d_latch_name_active, R.drawable.ic_latch_name);
            } else if (this instanceof C1905C) {
                gVar = new g(context, (AbstractC1906D) this, R.drawable.ic_jk_ff_name, R.drawable.ic_jk_ff_name_active, R.drawable.ic_latch_name);
            } else if (this instanceof d0) {
                gVar = new g(context, (AbstractC1906D) this, R.drawable.ic_t_ff_name, R.drawable.ic_t_ff_name_active, R.drawable.ic_latch_name);
            } else if (this instanceof V) {
                gVar = new g(context, (AbstractC1906D) this, R.drawable.ic_sr_latch_name, R.drawable.ic_sr_latch_name_active, R.drawable.ic_flip_flop_latch_subname);
            } else if (this instanceof C1927m) {
                gVar = new g(context, (AbstractC1906D) this, R.drawable.ic_d_latch_name, R.drawable.ic_d_latch_name_active, R.drawable.ic_flip_flop_latch_subname);
            } else if (this instanceof C1904B) {
                gVar = new g(context, (AbstractC1906D) this, R.drawable.ic_jk_ff_name, R.drawable.ic_jk_ff_name_active, R.drawable.ic_flip_flop_latch_subname);
            } else if (this instanceof c0) {
                gVar = new g(context, (AbstractC1906D) this, R.drawable.ic_t_ff_name, R.drawable.ic_t_ff_name_active, R.drawable.ic_flip_flop_latch_subname);
            } else if (this instanceof T) {
                C0214a c0214a2 = new C0214a(2);
                c0214a2.f3455s = (T) this;
                c0214a2.f3452p = context.getDrawable(R.drawable.ic_proximity_hand_draw);
                c0214a2.f3453q = r9.getIntrinsicWidth() / r9.getIntrinsicHeight();
                c0214a2.f3454r = context.getResources().getConfiguration().getLayoutDirection() == 1;
                eVar = c0214a2;
            } else if (this instanceof C1908F) {
                o oVar = new o(1, false);
                oVar.f36q = (C1908F) this;
                oVar.f37r = context.getDrawable(R.drawable.light_sensor_light);
                oVar.f35p = context.getResources().getConfiguration().getLayoutDirection() == 1;
                eVar = oVar;
            } else if (this instanceof C1910H) {
                o oVar2 = new o(2, false);
                oVar2.f36q = (C1910H) this;
                Paint paint11 = new Paint();
                oVar2.f37r = paint11;
                paint11.setStyle(Paint.Style.STROKE);
                paint11.setStrokeWidth(AbstractC1955j.c / 2.0f);
                paint11.setColor(AbstractC1955j.f14678f);
                paint11.setStrokeCap(Paint.Cap.ROUND);
                oVar2.f35p = context.getResources().getConfiguration().getLayoutDirection() == 1;
                eVar = oVar2;
            } else if (this instanceof C1918d) {
                ?? obj3 = new Object();
                obj3.f3460o = (C1918d) this;
                Paint paint12 = new Paint();
                obj3.f3461p = paint12;
                paint12.setStyle(Paint.Style.FILL_AND_STROKE);
                obj3.f3462q = context.getColor(R.color.battery_charge_color_low);
                obj3.f3463r = context.getColor(R.color.battery_charge_color_medium);
                obj3.f3464s = context.getColor(R.color.battery_charge_color_mediumhigh);
                obj3.f3465t = context.getColor(R.color.battery_charge_color_high);
                obj3.f3466u = context.getResources().getConfiguration().getLayoutDirection() == 1;
                eVar = obj3;
            } else if (this instanceof S) {
                C0214a c0214a3 = new C0214a(1);
                c0214a3.f3455s = (S) this;
                c0214a3.f3452p = context.getDrawable(R.drawable.ic_timer_tick);
                c0214a3.f3453q = r9.getIntrinsicWidth() / r9.getIntrinsicHeight();
                c0214a3.f3454r = context.getResources().getConfiguration().getLayoutDirection() == 1;
                eVar = c0214a3;
            } else if (this instanceof f0) {
                ?? obj4 = new Object();
                obj4.f111p = (f0) this;
                obj4.f110o = context.getResources().getConfiguration().getLayoutDirection() == 1;
                eVar = obj4;
            } else if (this instanceof j0) {
                q2.e eVar4 = new q2.e(13, false);
                eVar4.f14709p = (j0) this;
                Paint paint13 = new Paint();
                eVar4.f14710q = paint13;
                paint13.setStyle(Paint.Style.FILL_AND_STROKE);
                paint13.setStrokeWidth(AbstractC1955j.c / 2);
                paint13.setColor(AbstractC1955j.f14680h);
                eVar = eVar4;
            } else if (this instanceof C1932s) {
                C0783ji c0783ji = new C0783ji(12);
                c0783ji.f9211p = (C1932s) this;
                c0783ji.f9212q = context.getDrawable(R.drawable.lamp_light);
                eVar = c0783ji;
            } else if (this instanceof C1930p) {
                q2.e eVar5 = new q2.e(10, false);
                eVar5.f14709p = (C1930p) this;
                Paint paint14 = new Paint();
                eVar5.f14710q = paint14;
                paint14.setStyle(Paint.Style.FILL_AND_STROKE);
                paint14.setStrokeWidth(AbstractC1955j.c / 2);
                paint14.setColor(AbstractC1955j.f14680h);
                eVar = eVar5;
            } else if (this instanceof a0) {
                q2.e eVar6 = new q2.e(12, false);
                eVar6.f14709p = (a0) this;
                Paint paint15 = new Paint();
                eVar6.f14710q = paint15;
                paint15.setStyle(Paint.Style.FILL_AND_STROKE);
                paint15.setStrokeWidth(AbstractC1955j.c / 2);
                paint15.setColor(AbstractC1955j.f14680h);
                eVar = eVar6;
            } else if (this instanceof l0) {
                q2.e eVar7 = new q2.e(14, false);
                eVar7.f14709p = (l0) this;
                Paint paint16 = new Paint();
                eVar7.f14710q = paint16;
                paint16.setStyle(Paint.Style.FILL_AND_STROKE);
                paint16.setStrokeWidth(AbstractC1955j.c / 2);
                paint16.setColor(AbstractC1955j.f14680h);
                eVar = eVar7;
            } else if (this instanceof Q) {
                H1.a aVar4 = new H1.a(6);
                aVar4.f856q = (Q) this;
                aVar4.f857r = context.getDrawable(R.drawable.ic_line_resizer_v);
                aVar4.f858s = context.getDrawable(R.drawable.ic_line_resizer);
                aVar4.f855p = AbstractC1955j.d * 5;
                eVar = aVar4;
            } else {
                eVar = null;
            }
            eVar = gVar;
        }
        this.f13119C = eVar;
    }

    public abstract W0.a d(long j4);

    public abstract void f(Canvas canvas, boolean z4, boolean z5);

    public final float j() {
        return this.f13127t;
    }

    public final void l(RectF rectF) {
        rectF.left = this.f13124q;
        rectF.right = this.f13126s;
        rectF.top = this.f13125r;
        rectF.bottom = this.f13127t;
    }

    public abstract O0.a m(String str);

    public final float n() {
        return this.f13124q;
    }

    public abstract O0.a o(String str);

    public final float p() {
        return this.f13126s;
    }

    public final float q() {
        return this.f13125r;
    }

    public abstract int r();

    public final boolean s(int i4, int i5) {
        float f4 = i4;
        if (f4 <= this.f13124q - this.f13128u || f4 >= this.f13126s + this.f13130w) {
            return false;
        }
        float f5 = i5;
        return f5 > this.f13127t - ((float) this.f13131x) && f5 < this.f13125r + ((float) this.f13129v);
    }

    public abstract void t(ArrayList arrayList);

    public abstract void u(ArrayList arrayList);

    public boolean v() {
        return false;
    }

    public boolean w() {
        return false;
    }

    public abstract c x(int i4, int i5);

    public abstract void y(float f4, float f5);

    public void z(int i4) {
        this.f13121E = i4;
    }
}
