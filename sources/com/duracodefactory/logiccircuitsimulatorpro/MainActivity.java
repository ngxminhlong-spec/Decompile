package com.duracodefactory.logiccircuitsimulatorpro;

import A0.a;
import B0.q;
import C0.A0;
import C0.C;
import C0.DialogInterfaceOnClickListenerC0025z;
import C0.E;
import C0.H;
import C0.I;
import C0.N;
import C0.O;
import C0.ViewOnClickListenerC0004d;
import D0.g;
import D0.p;
import D0.r;
import L2.b;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Switch;
import androidx.fragment.app.C0152a;
import androidx.fragment.app.s;
import com.duracodefactory.logiccircuitsimulatorpro.ui.GoPremiumLayout;
import com.google.android.gms.internal.ads.Nu;
import com.google.android.gms.internal.ads.Wl;
import f.AbstractActivityC1671f;
import f.C1667b;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import m2.AbstractC1806a;
import q1.AbstractC1954i;
import q1.AbstractC1955j;
import q1.AbstractC1959n;
import q1.InterfaceC1948c;
import q1.InterfaceC1958m;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class MainActivity extends AbstractActivityC1671f implements A0, E, InterfaceC1958m, InterfaceC1948c {

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ int f3569O = 0;

    /* renamed from: G, reason: collision with root package name */
    public boolean f3570G;

    /* renamed from: H, reason: collision with root package name */
    public GoPremiumLayout f3571H;

    /* renamed from: I, reason: collision with root package name */
    public View f3572I;

    /* renamed from: J, reason: collision with root package name */
    public q f3573J;

    /* renamed from: K, reason: collision with root package name */
    public Wl f3574K;

    /* renamed from: L, reason: collision with root package name */
    public long f3575L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f3576M;
    public boolean N;

    public final void A() {
        long j4;
        if (this.f3572I.getVisibility() == 8) {
            return;
        }
        this.f3572I.setVisibility(8);
        Long l4 = AbstractC1806a.f14028g0;
        if (l4 != null) {
            j4 = l4.longValue();
        } else {
            j4 = getPreferences(0).getLong("go_premium_closed_times", 0L);
            AbstractC1806a.f14028g0 = Long.valueOf(j4);
        }
        long j5 = j4 + 1;
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putLong("go_premium_closed_times", j5);
        edit.apply();
        AbstractC1806a.f14028g0 = Long.valueOf(j5);
    }

    public final void B(boolean z4) {
        this.f3570G = true;
        View findViewById = findViewById(R.id.ui_changer);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        findViewById.setVisibility(0);
        findViewById.startAnimation(alphaAnimation);
        ((Switch) findViewById(R.id.dark_mode_swtich)).setChecked(z4);
        findViewById.postDelayed(new N(this, z4, findViewById), 500L);
    }

    public final void C(int i4) {
        this.f3570G = true;
        View findViewById = findViewById(R.id.ui_changer);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        findViewById.setVisibility(0);
        findViewById.startAnimation(alphaAnimation);
        findViewById.postDelayed(new O(i4, 0, this, findViewById), 500L);
    }

    public final void D() {
        View findViewById = findViewById(R.id.electrobox_activity);
        findViewById.setAlpha(0.0f);
        findViewById.setVisibility(0);
        findViewById.animate().alpha(1.0f);
        findViewById.findViewById(R.id.electrobox_activity_bottom_dim).setOnClickListener(new I(0, findViewById));
        findViewById.findViewById(R.id.electrobox_close).setOnClickListener(new I(1, findViewById));
        findViewById.findViewById(R.id.electrbox_activity_content_container).setOnClickListener(new ViewOnClickListenerC0004d(this, findViewById, 1));
    }

    public final boolean E(int i4) {
        HashMap hashMap;
        C c = new C(i4, 1, this);
        c.run();
        if (!AbstractC1806a.f14006P && (hashMap = AbstractC1806a.f14005O) != null && !hashMap.isEmpty()) {
            return true;
        }
        AbstractC1806a.w(this, new Nu(this, c, 14, false));
        return false;
    }

    public final void F(H h4) {
        s o4 = o();
        o4.getClass();
        C0152a c0152a = new C0152a(o4);
        c0152a.f(R.id.fragment_container, h4, null, 1);
        c0152a.c();
        c0152a.e(true);
    }

    @Override // q1.InterfaceC1958m
    public final void c() {
        if (AbstractC1806a.f14007Q) {
            GoPremiumLayout goPremiumLayout = this.f3571H;
            goPremiumLayout.findViewById(R.id.billing_error_container).setVisibility(8);
            goPremiumLayout.findViewById(R.id.pending_error_container).setVisibility(0);
        }
    }

    @Override // q1.InterfaceC1958m
    public final void d() {
        if (AbstractC1806a.O(this)) {
            this.f3571H.findViewById(R.id.billing_error_container).setVisibility(0);
            c();
            b bVar = new b(this);
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this).inflate(R.layout.payments_err_dialog, (ViewGroup) null);
            bVar.s(R.string.payment_error_1);
            ((C1667b) bVar.f113p).f12797n = viewGroup;
            bVar.q(R.string.close, new DialogInterfaceOnClickListenerC0025z(1));
            bVar.k();
        }
    }

    @Override // q1.InterfaceC1958m
    public final void g() {
        if (AbstractC1959n.d(this) || AbstractC1959n.b(this)) {
            GoPremiumLayout goPremiumLayout = this.f3571H;
            goPremiumLayout.findViewById(R.id.all_container).setVisibility(8);
            goPremiumLayout.findViewById(R.id.pricing_success).setVisibility(0);
            if (this.f3571H.getVisibility() == 0) {
                this.f3571H.postDelayed(new a(7, this), 4000L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // androidx.activity.d, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBackPressed() {
        /*
            r9 = this;
            android.view.View r0 = r9.f3572I
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L11
            com.duracodefactory.logiccircuitsimulatorpro.ui.GoPremiumLayout r0 = r9.f3571H
            r0.getClass()
            r9.A()
            return
        L11:
            r0 = 2131296471(0x7f0900d7, float:1.821086E38)
            android.view.View r0 = r9.findViewById(r0)
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L24
            r1 = 8
            r0.setVisibility(r1)
            return
        L24:
            androidx.fragment.app.s r0 = r9.o()
            r1 = 2131296515(0x7f090103, float:1.8210949E38)
            androidx.fragment.app.f r0 = r0.N(r1)
            C0.H r0 = (C0.H) r0
            r1 = 0
            if (r0 == 0) goto L39
            boolean r2 = r0.K()
            goto L3a
        L39:
            r2 = r1
        L3a:
            if (r2 != 0) goto Lb5
            super.onBackPressed()
            boolean r2 = r0 instanceof C0.D
            if (r2 == 0) goto Lae
            boolean r0 = q1.AbstractC1959n.d(r9)
            if (r0 != 0) goto Lb5
            boolean r0 = q1.AbstractC1959n.b(r9)
            if (r0 != 0) goto Lb5
            boolean r0 = q1.AbstractC1959n.c(r9)
            if (r0 != 0) goto Lb5
            boolean r0 = q1.AbstractC1949d.b(r9)
            r2 = 1
            if (r0 == 0) goto L97
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r3 = r0.getTime()
            java.util.Date r0 = q1.AbstractC1949d.f14651b
            long r5 = r0.getTime()
            int r0 = q1.AbstractC1949d.c
            long r7 = (long) r0
            long r5 = r5 + r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L97
            B0.q r0 = r9.f3573J
            boolean r3 = r0.f110o
            if (r3 == 0) goto L82
            int r3 = q1.AbstractC1949d.f14652e
            if (r3 != 0) goto L82
            java.lang.String r3 = "FIRST_AD_START"
            d3.AbstractC1654b.E(r3)
        L82:
            java.lang.Object r3 = r0.f111p
            com.google.android.gms.internal.ads.H8 r3 = (com.google.android.gms.internal.ads.H8) r3
            if (r3 != 0) goto L99
            boolean r3 = r0.f110o
            if (r3 == 0) goto L95
            int r3 = q1.AbstractC1949d.f14652e
            if (r3 != 0) goto L95
            java.lang.String r3 = "FIRST_AD_START_NO"
            d3.AbstractC1654b.E(r3)
        L95:
            r0.f110o = r1
        L97:
            r0 = r1
            goto L9f
        L99:
            r3.b(r9)
            r0.f110o = r1
            r0 = r2
        L9f:
            if (r0 != 0) goto Lb5
            boolean r0 = r9.N
            if (r0 == 0) goto La8
            r9.E(r1)
        La8:
            boolean r0 = r9.N
            r0 = r0 ^ r2
            r9.N = r0
            return
        Lae:
            boolean r0 = r0 instanceof C0.v0
            if (r0 == 0) goto Lb5
            java.lang.System.currentTimeMillis()
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.duracodefactory.logiccircuitsimulatorpro.MainActivity.onBackPressed():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:1|(1:3)|4|(10:6|(1:8)|9|(1:11)|12|(1:14)|15|(1:17)|18|(1:20))|21|(2:22|23)|24|(1:26)(1:101)|27|(3:29|(1:31)(1:78)|(19:33|(1:35)|36|37|(1:39)(3:74|(1:76)|77)|40|(1:42)(3:68|69|(1:71))|43|(1:45)|46|(1:48)|49|(1:51)(1:(1:66)(1:67))|52|(3:(1:55)|56|(1:58))|59|(1:61)|62|63))|79|80|81|82|(1:84)(1:98)|(3:86|(1:88)(1:96)|(20:90|91|92|93|37|(0)(0)|40|(0)(0)|43|(0)|46|(0)|49|(0)(0)|52|(0)|59|(0)|62|63))|97|91|92|93|37|(0)(0)|40|(0)(0)|43|(0)|46|(0)|49|(0)(0)|52|(0)|59|(0)|62|63) */
    /* JADX WARN: Can't wrap try/catch for region: R(37:1|(1:3)|4|(10:6|(1:8)|9|(1:11)|12|(1:14)|15|(1:17)|18|(1:20))|21|22|23|24|(1:26)(1:101)|27|(3:29|(1:31)(1:78)|(19:33|(1:35)|36|37|(1:39)(3:74|(1:76)|77)|40|(1:42)(3:68|69|(1:71))|43|(1:45)|46|(1:48)|49|(1:51)(1:(1:66)(1:67))|52|(3:(1:55)|56|(1:58))|59|(1:61)|62|63))|79|80|81|82|(1:84)(1:98)|(3:86|(1:88)(1:96)|(20:90|91|92|93|37|(0)(0)|40|(0)(0)|43|(0)|46|(0)|49|(0)(0)|52|(0)|59|(0)|62|63))|97|91|92|93|37|(0)(0)|40|(0)(0)|43|(0)|46|(0)|49|(0)(0)|52|(0)|59|(0)|62|63) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x024a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020c  */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, B0.q] */
    @Override // f.AbstractActivityC1671f, androidx.activity.d, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.duracodefactory.logiccircuitsimulatorpro.MainActivity.onCreate(android.os.Bundle):void");
    }

    @Override // f.AbstractActivityC1671f, android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        AbstractC1955j.f14697z.clear();
        AbstractC1955j.f14681i = -1;
        AbstractC1955j.f14680h = -1;
        AbstractC1955j.f14679g = -1;
        AbstractC1955j.f14678f = -1;
        AbstractC1955j.f14686n = -1;
        AbstractC1955j.f14685m = -1;
        AbstractC1955j.f14684l = -1;
        AbstractC1955j.f14683k = -1;
        AbstractC1955j.f14682j = -1;
        AbstractC1955j.f14692t = -1;
        AbstractC1955j.f14691s = -1;
        AbstractC1955j.d = -1;
        AbstractC1955j.f14689q = -1;
        AbstractC1954i.f14673e = null;
        AbstractC1954i.d = null;
        AbstractC1954i.f14672b = null;
        AbstractC1954i.f14671a = null;
        if (AbstractC1955j.f14675a == -1) {
            AbstractC1955j.f14675a = getResources().getDimensionPixelSize(R.dimen.elements_padding);
        }
        if (AbstractC1955j.f14676b == -1) {
            AbstractC1955j.f14676b = getResources().getDimensionPixelSize(R.dimen.nodes_dimen);
        }
        if (AbstractC1955j.c == -1) {
            AbstractC1955j.c = getResources().getDimensionPixelSize(R.dimen.nodes_stroke_width);
        }
        if (AbstractC1955j.f14677e == -1) {
            AbstractC1955j.f14677e = getResources().getDimensionPixelSize(R.dimen.nodes_radius);
        }
        if (AbstractC1955j.f14678f == -1) {
            AbstractC1955j.f14678f = getColor(R.color.element_nodes);
        }
        if (AbstractC1955j.f14679g == -1) {
            AbstractC1955j.f14679g = getColor(R.color.element_nodes_selected);
        }
        if (AbstractC1955j.f14680h == -1) {
            AbstractC1955j.f14680h = getColor(R.color.element_nodes_active);
        }
        if (AbstractC1955j.f14683k == -1) {
            AbstractC1955j.f14683k = getColor(R.color.path);
        }
        if (AbstractC1955j.f14681i == -1) {
            AbstractC1955j.f14681i = getColor(R.color.path_active);
        }
        if (AbstractC1955j.f14682j == -1) {
            AbstractC1955j.f14682j = getColor(R.color.path_selected);
        }
        if (AbstractC1955j.f14684l == -1) {
            AbstractC1955j.f14684l = getResources().getDimensionPixelSize(R.dimen.labels_text_size);
        }
        if (AbstractC1955j.f14685m == -1) {
            AbstractC1955j.f14685m = getColor(R.color.element_labels);
        }
        if (AbstractC1955j.f14686n == -1) {
            AbstractC1955j.f14686n = getColor(R.color.node_labels);
        }
        if (AbstractC1955j.f14687o == -1) {
            AbstractC1955j.f14687o = getResources().getDimensionPixelSize(R.dimen.nodes_text_size);
        }
        if (AbstractC1955j.f14688p == -1) {
            AbstractC1955j.f14688p = getResources().getDimensionPixelSize(R.dimen.nodes_text_padding);
        }
        if (AbstractC1955j.f14689q == -1) {
            AbstractC1955j.f14689q = getColor(R.color.snap_color);
        }
        if (AbstractC1955j.f14691s == -1) {
            AbstractC1955j.f14691s = getColor(R.color.inner_link_node_color);
        }
        if (AbstractC1955j.f14690r == -1) {
            AbstractC1955j.f14690r = getResources().getDimensionPixelSize(R.dimen.snap_stroke_width);
        }
        if (AbstractC1955j.f14692t == -1) {
            AbstractC1955j.f14692t = getColor(R.color.board_background);
        }
        if (AbstractC1955j.d == -1) {
            AbstractC1955j.d = getResources().getDimensionPixelSize(R.dimen.path_width_selected);
        }
        if (AbstractC1955j.f14693u == -1) {
            AbstractC1955j.f14693u = getResources().getDimensionPixelSize(R.dimen.sensor_data_text_size);
        }
        AbstractC1806a.c = context.getString(R.string.sensor);
        AbstractC1806a.d = context.getString(R.string.vendor);
        AbstractC1806a.f14023e = context.getString(R.string.accuracy);
        AbstractC1806a.f14025f = context.getString(R.string.consumption);
        AbstractC1806a.f14027g = context.getString(R.string.no_contact);
        AbstractC1806a.f14029h = context.getString(R.string.unreliable);
        AbstractC1806a.f14031i = context.getString(R.string.low);
        AbstractC1806a.f14033j = context.getString(R.string.medium);
        AbstractC1806a.f14035k = context.getString(R.string.high);
        AbstractC1806a.f14037l = context.getString(R.string.charge);
        AbstractC1806a.f14039m = context.getString(R.string.temp);
        AbstractC1806a.f14041n = context.getString(R.string.health);
        AbstractC1806a.f14042o = context.getString(R.string.voltage);
        AbstractC1806a.f14043p = context.getString(R.string.status);
        AbstractC1806a.f14044q = context.getString(R.string.tech);
        AbstractC1806a.f14045r = context.getString(R.string.battery_health_dead);
        AbstractC1806a.f14046s = context.getString(R.string.battery_health_good);
        AbstractC1806a.f14047t = context.getString(R.string.battery_health_overvolt);
        AbstractC1806a.f14048u = context.getString(R.string.battery_health_overheat);
        AbstractC1806a.f14049v = context.getString(R.string.battery_health_fail);
        AbstractC1806a.f14050w = context.getString(R.string.charging);
        AbstractC1806a.f14051x = context.getString(R.string.battery_status_discharging);
        AbstractC1806a.y = context.getString(R.string.battery_status_full);
        AbstractC1806a.f14052z = context.getString(R.string.battery_status_not_charging);
        AbstractC1806a.f13992A = context.getString(R.string.unknown);
        Paint paint = new Paint();
        AbstractC1806a.f13993B = paint;
        paint.setColor(AbstractC1955j.f14686n);
        AbstractC1806a.f13993B.setTextSize(AbstractC1955j.f14693u);
        AbstractC1806a.f13993B.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        return super.onCreateView(view, str, context, attributeSet);
    }

    @Override // f.AbstractActivityC1671f, android.app.Activity
    public final void onDestroy() {
        AbstractC1806a.Q();
        AbstractC1959n.f14703f.remove(this);
        super.onDestroy();
    }

    @Override // f.AbstractActivityC1671f, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        H h4 = (H) o().N(R.id.fragment_container);
        if (h4 != null) {
            h4.L(false, keyEvent);
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i4, KeyEvent keyEvent) {
        H h4 = (H) o().N(R.id.fragment_container);
        if (h4 != null) {
            h4.L(true, keyEvent);
        }
        return super.onKeyUp(i4, keyEvent);
    }

    @Override // f.AbstractActivityC1671f, android.app.Activity
    public final void onResume() {
        try {
            Boolean bool = AbstractC1959n.f14700a;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(AbstractC1959n.a(this));
            calendar.add(6, 1);
            calendar.getTime().getTime();
            new Date().getTime();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.onResume();
    }

    @Override // f.AbstractActivityC1671f, androidx.activity.d, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("changeUI", this.f3570G);
        bundle.putLong("starttimemillis", this.f3575L);
        if (bundle.getBoolean("askdjhasdlkaujhdflksajfndhvsldkfjhsdf", false)) {
            F(new g());
        }
        if (bundle.getBoolean("askdjhasdlkaujhdflksajfndhvsasdasdldkfjhsdf", false)) {
            F(new p());
        }
        if (bundle.getBoolean("askdjhasdlkauasdasdasdjhdflksajfndhvsasdasdldkfjhsdf", false)) {
            F(new r());
        }
    }

    public final void z() {
        PackageManager packageManager = getPackageManager();
        if (packageManager != null) {
            try {
                packageManager.getPackageInfo("com.duracodefactory.electronics.calculator", 0);
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage("com.duracodefactory.electronics.calculator");
                if (launchIntentForPackage != null) {
                    startActivity(launchIntentForPackage);
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        PackageManager packageManager2 = getPackageManager();
        if (packageManager2 != null) {
            try {
                packageManager2.getPackageInfo("com.duracodefactory.electrobox.electronics", 0);
                Intent launchIntentForPackage2 = packageManager2.getLaunchIntentForPackage("com.duracodefactory.electrobox.electronics");
                if (launchIntentForPackage2 != null) {
                    startActivity(launchIntentForPackage2);
                    return;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.duracodefactory.electrobox.electronics"));
        intent.setPackage("com.android.vending");
        try {
            startActivity(intent);
        } catch (Throwable unused) {
        }
    }
}
