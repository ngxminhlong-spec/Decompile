package o1;

import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.ui.StartupScreen;
import com.google.android.gms.internal.ads.C0258Da;
import d3.AbstractC1654b;
import java.util.HashMap;
import java.util.WeakHashMap;
import m2.AbstractC1806a;
import q1.AbstractC1949d;
import q1.AbstractC1959n;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1838N implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14220o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ StartupScreen f14221p;

    public /* synthetic */ ViewOnClickListenerC1838N(StartupScreen startupScreen, int i4) {
        this.f14220o = i4;
        this.f14221p = startupScreen;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        HashMap hashMap;
        int i4 = this.f14220o;
        StartupScreen startupScreen = this.f14221p;
        switch (i4) {
            case 0:
                if (startupScreen.f3712r != StartupScreen.f3708t.size() - 1) {
                    startupScreen.f3712r++;
                    WeakHashMap weakHashMap = H.A.f779a;
                    if (startupScreen.getLayoutDirection() == 0) {
                        StartupScreen.a(startupScreen);
                        return;
                    } else {
                        StartupScreen.b(startupScreen);
                        return;
                    }
                }
                InterfaceC1840P interfaceC1840P = startupScreen.f3713s;
                if (interfaceC1840P != null) {
                    C0258Da c0258Da = (C0258Da) interfaceC1840P;
                    ViewGroup viewGroup = (ViewGroup) c0258Da.f4618p;
                    MainActivity mainActivity = (MainActivity) c0258Da.f4619q;
                    int i5 = MainActivity.f3569O;
                    try {
                        mainActivity.setRequestedOrientation(-1);
                    } catch (Throwable unused) {
                    }
                    AbstractC1654b.C(mainActivity);
                    int o4 = AbstractC1806a.o(mainActivity) + 1;
                    int i6 = 0;
                    SharedPreferences.Editor edit = mainActivity.getPreferences(0).edit();
                    edit.putInt("launch_times", o4);
                    edit.apply();
                    AbstractC1806a.f14030h0 = Integer.valueOf(o4);
                    int o5 = AbstractC1806a.o(mainActivity);
                    AbstractC1949d.f14652e = o5;
                    if (o5 == 0) {
                        AbstractC1654b.E("FIRST_START");
                    }
                    SharedPreferences.Editor edit2 = mainActivity.getPreferences(0).edit();
                    edit2.putBoolean("eula_accepted", true);
                    edit2.apply();
                    Boolean bool = Boolean.TRUE;
                    AbstractC1806a.f14022d0 = bool;
                    SharedPreferences.Editor edit3 = mainActivity.getPreferences(0).edit();
                    edit3.putBoolean("eula_accepted2", true);
                    edit3.apply();
                    AbstractC1806a.f14024e0 = bool;
                    SharedPreferences.Editor edit4 = mainActivity.getPreferences(0).edit();
                    edit4.putBoolean("can_show_ads_new2", true);
                    edit4.apply();
                    AbstractC1949d.f14650a = bool;
                    viewGroup.postDelayed(new C0.J(i6, viewGroup), 100L);
                    viewGroup.animate().alpha(0.0f).setDuration(64L).start();
                    AbstractC1949d.c(mainActivity, false);
                    SharedPreferences.Editor edit5 = mainActivity.getPreferences(0).edit();
                    edit5.putBoolean("show_loading", true);
                    edit5.apply();
                    AbstractC1806a.f14032i0 = bool;
                    if (AbstractC1959n.b(mainActivity) || (hashMap = AbstractC1806a.f14005O) == null || AbstractC1806a.p(hashMap).isEmpty()) {
                        return;
                    }
                    mainActivity.E(0);
                    return;
                }
                return;
            default:
                int i7 = startupScreen.f3712r;
                if (i7 == 0) {
                    return;
                }
                startupScreen.f3712r = i7 - 1;
                WeakHashMap weakHashMap2 = H.A.f779a;
                if (startupScreen.getLayoutDirection() == 0) {
                    StartupScreen.b(startupScreen);
                    return;
                } else {
                    StartupScreen.a(startupScreen);
                    return;
                }
        }
    }
}
