package N1;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.ads.C0831kn;
import com.google.android.gms.internal.ads.Y9;
import g.AbstractC1678a;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import k.o;
import l.T;
import l.r;
import l.x0;
import t2.C1995b;
import t2.C1996c;
import t2.C1997d;
import t2.C2000g;
import t2.C2004k;
import t2.C2006m;
import t2.E;
import t2.F;
import t2.G;
import t2.H;
import t2.J;
import t2.s;
import w1.C2045h;
import w1.C2049l;
import y2.C2118a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class l implements F {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1188o;

    /* renamed from: p, reason: collision with root package name */
    public Object f1189p;

    /* renamed from: q, reason: collision with root package name */
    public Object f1190q;

    /* renamed from: r, reason: collision with root package name */
    public Object f1191r;

    /* renamed from: s, reason: collision with root package name */
    public Object f1192s;

    /* renamed from: t, reason: collision with root package name */
    public Object f1193t;

    /* renamed from: u, reason: collision with root package name */
    public Object f1194u;

    public l() {
        this.f1188o = 3;
        this.f1189p = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f1190q = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f1191r = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};
        this.f1192s = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f1193t = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f1194u = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public /* synthetic */ l(int i4) {
        this.f1188o = i4;
    }

    public l(Context context, String str) {
        String concat;
        this.f1188o = 0;
        this.f1189p = context.getApplicationContext();
        this.f1190q = str;
        this.f1194u = new TreeMap();
        String packageName = context.getPackageName();
        try {
            concat = packageName + "-" + m2.c.a(context).b(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e4) {
            Y9.q("Unable to get package version name for reporting", e4);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.f1193t = concat;
    }

    public l(Set set, String str, String str2) {
        this.f1188o = 2;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f1189p = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f1190q = str;
        this.f1191r = str2;
        this.f1193t = C2118a.f15911b;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f1192s = Collections.unmodifiableSet(hashSet);
    }

    public /* synthetic */ l(G g4, E e4, E e5, H h4, F f4, H h5, int i4) {
        this.f1188o = i4;
        this.f1189p = g4;
        this.f1190q = e4;
        this.f1191r = e5;
        this.f1192s = h4;
        this.f1193t = f4;
        this.f1194u = h5;
    }

    public static boolean b(int[] iArr, int i4) {
        for (int i5 : iArr) {
            if (i5 == i4) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList e(Context context, int i4) {
        int b4 = x0.b(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{x0.f13860b, x0.d, x0.c, x0.f13862f}, new int[]{x0.a(context, R.attr.colorButtonNormal), A.a.b(b4, i4), A.a.b(b4, i4), i4});
    }

    public static void g(Drawable drawable, int i4, PorterDuff.Mode mode) {
        if (T.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = r.f13820b;
        }
        drawable.setColorFilter(r.c(i4, mode));
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f1194u;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    @Override // t2.H
    public Object c() {
        switch (this.f1188o) {
            case 4:
                Application application = (Application) ((H) this.f1189p).c();
                return new C2000g(application, (C2006m) ((E) this.f1191r).c(), (C1997d) ((H) this.f1192s).c(), (C2004k) ((G) this.f1193t).f14862o, (C0831kn) this.f1194u);
            default:
                return h();
        }
    }

    public C2045h d() {
        String str = ((String) this.f1190q) == null ? " transportName" : "";
        if (((C2049l) this.f1191r) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f1192s) == null) {
            str = n0.a.h(str, " eventMillis");
        }
        if (((Long) this.f1193t) == null) {
            str = n0.a.h(str, " uptimeMillis");
        }
        if (((HashMap) this.f1194u) == null) {
            str = n0.a.h(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new C2045h((String) this.f1190q, (Integer) this.f1189p, (C2049l) this.f1191r, ((Long) this.f1192s).longValue(), ((Long) this.f1193t).longValue(), (HashMap) this.f1194u);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public ColorStateList f(Context context, int i4) {
        if (i4 == R.drawable.abc_edit_text_material) {
            Object obj = AbstractC1678a.f12977a;
            return context.getColorStateList(R.color.abc_tint_edittext);
        }
        if (i4 == R.drawable.abc_switch_track_mtrl_alpha) {
            Object obj2 = AbstractC1678a.f12977a;
            return context.getColorStateList(R.color.abc_tint_switch_track);
        }
        if (i4 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList c = x0.c(context, R.attr.colorSwitchThumbNormal);
            if (c == null || !c.isStateful()) {
                iArr[0] = x0.f13860b;
                iArr2[0] = x0.a(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = x0.f13861e;
                iArr2[1] = x0.b(context, R.attr.colorControlActivated);
                iArr[2] = x0.f13862f;
                iArr2[2] = x0.b(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = x0.f13860b;
                iArr[0] = iArr3;
                iArr2[0] = c.getColorForState(iArr3, 0);
                iArr[1] = x0.f13861e;
                iArr2[1] = x0.b(context, R.attr.colorControlActivated);
                iArr[2] = x0.f13862f;
                iArr2[2] = c.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i4 == R.drawable.abc_btn_default_mtrl_shape) {
            return e(context, x0.b(context, R.attr.colorButtonNormal));
        }
        if (i4 == R.drawable.abc_btn_borderless_material) {
            return e(context, 0);
        }
        if (i4 == R.drawable.abc_btn_colored_material) {
            return e(context, x0.b(context, R.attr.colorAccent));
        }
        if (i4 == R.drawable.abc_spinner_mtrl_am_alpha || i4 == R.drawable.abc_spinner_textfield_background_material) {
            Object obj3 = AbstractC1678a.f12977a;
            return context.getColorStateList(R.color.abc_tint_spinner);
        }
        if (b((int[]) this.f1190q, i4)) {
            return x0.c(context, R.attr.colorControlNormal);
        }
        if (b((int[]) this.f1193t, i4)) {
            Object obj4 = AbstractC1678a.f12977a;
            return context.getColorStateList(R.color.abc_tint_default);
        }
        if (b((int[]) this.f1194u, i4)) {
            Object obj5 = AbstractC1678a.f12977a;
            return context.getColorStateList(R.color.abc_tint_btn_checkable);
        }
        if (i4 != R.drawable.abc_seekbar_thumb_material) {
            return null;
        }
        Object obj6 = AbstractC1678a.f12977a;
        return context.getColorStateList(R.color.abc_tint_seek_thumb);
    }

    public C1995b h() {
        Application application = (Application) ((H) this.f1189p).c();
        C2006m c2006m = (C2006m) ((E) this.f1190q).c();
        Handler handler = s.f14935a;
        t2.r.c(handler);
        o3.i iVar = s.f14936b;
        t2.r.c(iVar);
        return new C1995b(application, c2006m, handler, iVar, (J) ((H) this.f1191r).c(), ((C1996c) ((H) this.f1192s)).c(), (C2000g) ((o) this.f1193t).c(), (C1997d) ((H) this.f1194u).c());
    }
}
