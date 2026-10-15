package f;

import H.A;
import H.AbstractC0044t;
import H.F;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import com.google.android.gms.internal.ads.AbstractC0287Ic;
import e.AbstractC1657a;
import j.AbstractC1719a;
import j.C1721c;
import j.C1726h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.C1763e;
import l.C1773j;
import l.G0;
import l.M0;
import l.Q;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class q extends h implements k.k, LayoutInflater.Factory2 {

    /* renamed from: m0, reason: collision with root package name */
    public static final r.e f12868m0 = new r.i(0);

    /* renamed from: n0, reason: collision with root package name */
    public static final int[] f12869n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final boolean f12870o0;

    /* renamed from: A, reason: collision with root package name */
    public j f12871A;

    /* renamed from: B, reason: collision with root package name */
    public k f12872B;

    /* renamed from: C, reason: collision with root package name */
    public AbstractC1719a f12873C;

    /* renamed from: D, reason: collision with root package name */
    public ActionBarContextView f12874D;

    /* renamed from: E, reason: collision with root package name */
    public PopupWindow f12875E;

    /* renamed from: F, reason: collision with root package name */
    public i f12876F;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12878H;

    /* renamed from: I, reason: collision with root package name */
    public ViewGroup f12879I;

    /* renamed from: J, reason: collision with root package name */
    public TextView f12880J;

    /* renamed from: K, reason: collision with root package name */
    public View f12881K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f12882L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f12883M;
    public boolean N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f12884O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f12885P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f12886Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f12887R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f12888S;

    /* renamed from: T, reason: collision with root package name */
    public p[] f12889T;

    /* renamed from: U, reason: collision with root package name */
    public p f12890U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f12891V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f12892W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f12893X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f12894Y;

    /* renamed from: Z, reason: collision with root package name */
    public final int f12895Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f12896a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f12897b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f12898c0;

    /* renamed from: d0, reason: collision with root package name */
    public n f12899d0;

    /* renamed from: e0, reason: collision with root package name */
    public n f12900e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f12901f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f12902g0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f12904i0;

    /* renamed from: j0, reason: collision with root package name */
    public Rect f12905j0;

    /* renamed from: k0, reason: collision with root package name */
    public Rect f12906k0;

    /* renamed from: l0, reason: collision with root package name */
    public AppCompatViewInflater f12907l0;

    /* renamed from: r, reason: collision with root package name */
    public final Object f12908r;

    /* renamed from: s, reason: collision with root package name */
    public final Context f12909s;

    /* renamed from: t, reason: collision with root package name */
    public Window f12910t;

    /* renamed from: u, reason: collision with root package name */
    public m f12911u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f12912v;

    /* renamed from: w, reason: collision with root package name */
    public w f12913w;

    /* renamed from: x, reason: collision with root package name */
    public C1726h f12914x;
    public CharSequence y;

    /* renamed from: z, reason: collision with root package name */
    public Q f12915z;

    /* renamed from: G, reason: collision with root package name */
    public F f12877G = null;

    /* renamed from: h0, reason: collision with root package name */
    public final i f12903h0 = new i(this, 0);

    /* JADX WARN: Type inference failed for: r0v0, types: [r.e, r.i] */
    static {
        int i4 = Build.VERSION.SDK_INT;
        f12869n0 = new int[]{R.attr.windowBackground};
        f12870o0 = i4 <= 25;
    }

    public q(Context context, Window window, InterfaceC1672g interfaceC1672g, Object obj) {
        AbstractActivityC1671f abstractActivityC1671f = null;
        this.f12895Z = -100;
        this.f12909s = context;
        this.f12912v = interfaceC1672g;
        this.f12908r = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AbstractActivityC1671f)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        abstractActivityC1671f = (AbstractActivityC1671f) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (abstractActivityC1671f != null) {
                this.f12895Z = ((q) abstractActivityC1671f.n()).f12895Z;
            }
        }
        if (this.f12895Z == -100) {
            Class<?> cls = this.f12908r.getClass();
            r.e eVar = f12868m0;
            Integer num = (Integer) eVar.get(cls);
            if (num != null) {
                this.f12895Z = num.intValue();
                eVar.remove(this.f12908r.getClass());
            }
        }
        if (window != null) {
            k(window);
        }
        l.r.d();
    }

    @Override // f.h
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f12909s);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof q) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // f.h
    public final void b() {
        String str;
        this.f12892W = true;
        j(false);
        r();
        Object obj = this.f12908r;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = android.support.v4.media.session.a.l(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e4) {
                    throw new IllegalArgumentException(e4);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                w wVar = this.f12913w;
                if (wVar == null) {
                    this.f12904i0 = true;
                } else {
                    wVar.m0(true);
                }
            }
        }
    }

    @Override // f.h
    public final boolean d(int i4) {
        if (i4 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i4 = 108;
        } else if (i4 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i4 = 109;
        }
        if (this.f12887R && i4 == 108) {
            return false;
        }
        if (this.N && i4 == 1) {
            this.N = false;
        }
        if (i4 == 1) {
            z();
            this.f12887R = true;
            return true;
        }
        if (i4 == 2) {
            z();
            this.f12882L = true;
            return true;
        }
        if (i4 == 5) {
            z();
            this.f12883M = true;
            return true;
        }
        if (i4 == 10) {
            z();
            this.f12885P = true;
            return true;
        }
        if (i4 == 108) {
            z();
            this.N = true;
            return true;
        }
        if (i4 != 109) {
            return this.f12910t.requestFeature(i4);
        }
        z();
        this.f12884O = true;
        return true;
    }

    @Override // f.h
    public final void e(int i4) {
        q();
        ViewGroup viewGroup = (ViewGroup) this.f12879I.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f12909s).inflate(i4, viewGroup);
        this.f12911u.f12850o.onContentChanged();
    }

    @Override // k.k
    public final boolean g(k.m mVar, MenuItem menuItem) {
        p pVar;
        Window.Callback callback = this.f12910t.getCallback();
        if (callback != null && !this.f12894Y) {
            k.m k3 = mVar.k();
            p[] pVarArr = this.f12889T;
            int length = pVarArr != null ? pVarArr.length : 0;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    pVar = pVarArr[i4];
                    if (pVar != null && pVar.f12859h == k3) {
                        break;
                    }
                    i4++;
                } else {
                    pVar = null;
                    break;
                }
            }
            if (pVar != null) {
                return callback.onMenuItemSelected(pVar.f12854a, menuItem);
            }
        }
        return false;
    }

    @Override // f.h
    public final void h(CharSequence charSequence) {
        this.y = charSequence;
        Q q4 = this.f12915z;
        if (q4 != null) {
            q4.setWindowTitle(charSequence);
            return;
        }
        w wVar = this.f12913w;
        if (wVar == null) {
            TextView textView = this.f12880J;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        G0 g02 = (G0) wVar.f12939l;
        if (g02.f13607g) {
            return;
        }
        g02.f13608h = charSequence;
        if ((g02.f13604b & 8) != 0) {
            g02.f13603a.setTitle(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // k.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(k.m r6) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.q.i(k.m):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:5|(1:7)|8|(2:(1:(1:(1:(3:15|(1:17)|18)(2:19|20)))(2:21|(1:23)))|24)|25|(1:(1:28)(1:164))(1:165)|29|(2:33|(9:35|36|(4:144|145|146|147)|39|(2:46|(3:48|(1:50)(1:52)|51))|(1:138)(5:55|(2:58|(4:60|(3:87|88|89)|62|(3:64|65|(5:67|(3:78|79|80)|69|(2:73|74)|(1:72))))(5:93|(3:104|105|106)|95|(2:99|100)|(1:98)))|110|(1:112)|(2:116|(2:118|(1:120))(2:121|(1:123))))|(1:125)(2:135|(1:137))|(3:127|(1:129)|130)(2:132|(1:134))|131)(4:151|152|(1:159)(1:156)|157))|163|36|(0)|140|142|144|145|146|147|39|(3:44|46|(0))|(0)|138|(0)(0)|(0)(0)|131) */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00cf, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00d0, code lost:
    
        android.util.Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(boolean r14) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.q.j(boolean):boolean");
    }

    public final void k(Window window) {
        int resourceId;
        if (this.f12910t != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof m) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        m mVar = new m(this, callback);
        this.f12911u = mVar;
        window.setCallback(mVar);
        Context context = this.f12909s;
        Drawable drawable = null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f12869n0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            l.r a4 = l.r.a();
            synchronized (a4) {
                drawable = a4.f13821a.g(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f12910t = window;
    }

    public final void l(int i4, p pVar, k.m mVar) {
        if (mVar == null) {
            if (pVar == null && i4 >= 0) {
                p[] pVarArr = this.f12889T;
                if (i4 < pVarArr.length) {
                    pVar = pVarArr[i4];
                }
            }
            if (pVar != null) {
                mVar = pVar.f12859h;
            }
        }
        if ((pVar == null || pVar.f12864m) && !this.f12894Y) {
            this.f12911u.f12850o.onPanelClosed(i4, mVar);
        }
    }

    public final void m(k.m mVar) {
        C1773j c1773j;
        if (this.f12888S) {
            return;
        }
        this.f12888S = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f12915z;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((G0) actionBarOverlayLayout.f2525s).f13603a.f2624o;
        if (actionMenuView != null && (c1773j = actionMenuView.f2536H) != null) {
            c1773j.e();
            C1763e c1763e = c1773j.f13773I;
            if (c1763e != null && c1763e.b()) {
                c1763e.f13494i.dismiss();
            }
        }
        Window.Callback callback = this.f12910t.getCallback();
        if (callback != null && !this.f12894Y) {
            callback.onPanelClosed(108, mVar);
        }
        this.f12888S = false;
    }

    public final void n(p pVar, boolean z4) {
        o oVar;
        Q q4;
        C1773j c1773j;
        if (z4 && pVar.f12854a == 0 && (q4 = this.f12915z) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) q4;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((G0) actionBarOverlayLayout.f2525s).f13603a.f2624o;
            if (actionMenuView != null && (c1773j = actionMenuView.f2536H) != null && c1773j.i()) {
                m(pVar.f12859h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f12909s.getSystemService("window");
        if (windowManager != null && pVar.f12864m && (oVar = pVar.f12856e) != null) {
            windowManager.removeView(oVar);
            if (z4) {
                l(pVar.f12854a, pVar, null);
            }
        }
        pVar.f12862k = false;
        pVar.f12863l = false;
        pVar.f12864m = false;
        pVar.f12857f = null;
        pVar.f12865n = true;
        if (this.f12890U == pVar) {
            this.f12890U = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cd, code lost:
    
        if (r7.e() != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f3, code lost:
    
        if (r7.n() != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0173 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.q.o(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0113, code lost:
    
        if (r11.equals("ImageButton") == false) goto L27;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r10, java.lang.String r11, android.content.Context r12, android.util.AttributeSet r13) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.q.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public final void p(int i4) {
        p t4 = t(i4);
        if (t4.f12859h != null) {
            Bundle bundle = new Bundle();
            t4.f12859h.t(bundle);
            if (bundle.size() > 0) {
                t4.f12867p = bundle;
            }
            t4.f12859h.w();
            t4.f12859h.clear();
        }
        t4.f12866o = true;
        t4.f12865n = true;
        if ((i4 == 108 || i4 == 0) && this.f12915z != null) {
            p t5 = t(0);
            t5.f12862k = false;
            y(t5, null);
        }
    }

    public final void q() {
        ViewGroup viewGroup;
        if (this.f12878H) {
            return;
        }
        Context context = this.f12909s;
        int[] iArr = AbstractC1657a.f12642j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(115)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(124, false)) {
            d(1);
        } else if (obtainStyledAttributes.getBoolean(115, false)) {
            d(108);
        }
        if (obtainStyledAttributes.getBoolean(116, false)) {
            d(109);
        }
        if (obtainStyledAttributes.getBoolean(117, false)) {
            d(10);
        }
        this.f12886Q = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        r();
        this.f12910t.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f12887R) {
            viewGroup = this.f12885P ? (ViewGroup) from.inflate(com.duracodefactory.logiccircuitsimulatorpro.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.duracodefactory.logiccircuitsimulatorpro.R.layout.abc_screen_simple, (ViewGroup) null);
            j jVar = new j(this);
            WeakHashMap weakHashMap = A.f779a;
            AbstractC0044t.k(viewGroup, jVar);
        } else if (this.f12886Q) {
            viewGroup = (ViewGroup) from.inflate(com.duracodefactory.logiccircuitsimulatorpro.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f12884O = false;
            this.N = false;
        } else if (this.N) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.duracodefactory.logiccircuitsimulatorpro.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C1721c(context, typedValue.resourceId) : context).inflate(com.duracodefactory.logiccircuitsimulatorpro.R.layout.abc_screen_toolbar, (ViewGroup) null);
            Q q4 = (Q) viewGroup.findViewById(com.duracodefactory.logiccircuitsimulatorpro.R.id.decor_content_parent);
            this.f12915z = q4;
            q4.setWindowCallback(this.f12910t.getCallback());
            if (this.f12884O) {
                ((ActionBarOverlayLayout) this.f12915z).j(109);
            }
            if (this.f12882L) {
                ((ActionBarOverlayLayout) this.f12915z).j(2);
            }
            if (this.f12883M) {
                ((ActionBarOverlayLayout) this.f12915z).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.N + ", windowActionBarOverlay: " + this.f12884O + ", android:windowIsFloating: " + this.f12886Q + ", windowActionModeOverlay: " + this.f12885P + ", windowNoTitle: " + this.f12887R + " }");
        }
        if (this.f12915z == null) {
            this.f12880J = (TextView) viewGroup.findViewById(com.duracodefactory.logiccircuitsimulatorpro.R.id.title);
        }
        Method method = M0.f13663a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException e4) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e4);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e5) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e5);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.duracodefactory.logiccircuitsimulatorpro.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f12910t.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f12910t.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new k(this));
        this.f12879I = viewGroup;
        Object obj = this.f12908r;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.y;
        if (!TextUtils.isEmpty(title)) {
            Q q5 = this.f12915z;
            if (q5 != null) {
                q5.setWindowTitle(title);
            } else {
                w wVar = this.f12913w;
                if (wVar != null) {
                    G0 g02 = (G0) wVar.f12939l;
                    if (!g02.f13607g) {
                        g02.f13608h = title;
                        if ((g02.f13604b & 8) != 0) {
                            g02.f13603a.setTitle(title);
                        }
                    }
                } else {
                    TextView textView = this.f12880J;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f12879I.findViewById(R.id.content);
        View decorView = this.f12910t.getDecorView();
        contentFrameLayout2.f2553u.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = A.f779a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(118)) {
            obtainStyledAttributes2.getValue(118, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(119)) {
            obtainStyledAttributes2.getValue(119, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f12878H = true;
        p t4 = t(0);
        if (this.f12894Y || t4.f12859h != null) {
            return;
        }
        v(108);
    }

    public final void r() {
        if (this.f12910t == null) {
            Object obj = this.f12908r;
            if (obj instanceof Activity) {
                k(((Activity) obj).getWindow());
            }
        }
        if (this.f12910t == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0287Ic s() {
        if (this.f12899d0 == null) {
            if (q2.e.f14707t == null) {
                Context applicationContext = this.f12909s.getApplicationContext();
                q2.e.f14707t = new q2.e(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f12899d0 = new n(this, q2.e.f14707t);
        }
        return this.f12899d0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r2 <= r5) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [f.p, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f.p t(int r5) {
        /*
            r4 = this;
            f.p[] r0 = r4.f12889T
            r1 = 0
            if (r0 == 0) goto L8
            int r2 = r0.length
            if (r2 > r5) goto L15
        L8:
            int r2 = r5 + 1
            f.p[] r2 = new f.p[r2]
            if (r0 == 0) goto L12
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L12:
            r4.f12889T = r2
            r0 = r2
        L15:
            r2 = r0[r5]
            if (r2 != 0) goto L24
            f.p r2 = new f.p
            r2.<init>()
            r2.f12854a = r5
            r2.f12865n = r1
            r0[r5] = r2
        L24:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f.q.t(int):f.p");
    }

    public final void u() {
        q();
        if (this.N && this.f12913w == null) {
            Object obj = this.f12908r;
            if (obj instanceof Activity) {
                this.f12913w = new w((Activity) obj, this.f12884O);
            } else if (obj instanceof Dialog) {
                this.f12913w = new w((Dialog) obj);
            }
            w wVar = this.f12913w;
            if (wVar != null) {
                wVar.m0(this.f12904i0);
            }
        }
    }

    public final void v(int i4) {
        this.f12902g0 = (1 << i4) | this.f12902g0;
        if (this.f12901f0) {
            return;
        }
        View decorView = this.f12910t.getDecorView();
        WeakHashMap weakHashMap = A.f779a;
        decorView.postOnAnimation(this.f12903h0);
        this.f12901f0 = true;
    }

    public final void w(p pVar, KeyEvent keyEvent) {
        int i4;
        ViewGroup.LayoutParams layoutParams;
        boolean z4 = pVar.f12864m;
        int i5 = pVar.f12854a;
        if (z4 || this.f12894Y) {
            return;
        }
        Context context = this.f12909s;
        if (i5 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f12910t.getCallback();
        if (callback != null && !callback.onMenuOpened(i5, pVar.f12859h)) {
            n(pVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && y(pVar, keyEvent)) {
            o oVar = pVar.f12856e;
            if (oVar == null || pVar.f12865n) {
                if (oVar == null) {
                    u();
                    w wVar = this.f12913w;
                    Context k02 = wVar != null ? wVar.k0() : null;
                    if (k02 != null) {
                        context = k02;
                    }
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme newTheme = context.getResources().newTheme();
                    newTheme.setTo(context.getTheme());
                    newTheme.resolveAttribute(com.duracodefactory.logiccircuitsimulatorpro.R.attr.actionBarPopupTheme, typedValue, true);
                    int i6 = typedValue.resourceId;
                    if (i6 != 0) {
                        newTheme.applyStyle(i6, true);
                    }
                    newTheme.resolveAttribute(com.duracodefactory.logiccircuitsimulatorpro.R.attr.panelMenuListTheme, typedValue, true);
                    int i7 = typedValue.resourceId;
                    if (i7 != 0) {
                        newTheme.applyStyle(i7, true);
                    } else {
                        newTheme.applyStyle(com.duracodefactory.logiccircuitsimulatorpro.R.style.Theme_AppCompat_CompactMenu, true);
                    }
                    C1721c c1721c = new C1721c(context, 0);
                    c1721c.getTheme().setTo(newTheme);
                    pVar.f12861j = c1721c;
                    TypedArray obtainStyledAttributes = c1721c.obtainStyledAttributes(AbstractC1657a.f12642j);
                    pVar.f12855b = obtainStyledAttributes.getResourceId(84, 0);
                    pVar.d = obtainStyledAttributes.getResourceId(1, 0);
                    obtainStyledAttributes.recycle();
                    pVar.f12856e = new o(this, pVar.f12861j);
                    pVar.c = 81;
                } else if (pVar.f12865n && oVar.getChildCount() > 0) {
                    pVar.f12856e.removeAllViews();
                }
                View view = pVar.f12858g;
                if (view != null) {
                    pVar.f12857f = view;
                } else {
                    if (pVar.f12859h == null) {
                        return;
                    }
                    if (this.f12872B == null) {
                        this.f12872B = new k(this);
                    }
                    k kVar = this.f12872B;
                    if (pVar.f12860i == null) {
                        k.i iVar = new k.i(pVar.f12861j);
                        pVar.f12860i = iVar;
                        iVar.f13418s = kVar;
                        k.m mVar = pVar.f12859h;
                        mVar.b(iVar, mVar.f13426a);
                    }
                    k.i iVar2 = pVar.f12860i;
                    o oVar2 = pVar.f12856e;
                    if (iVar2.f13417r == null) {
                        iVar2.f13417r = (ExpandedMenuView) iVar2.f13415p.inflate(com.duracodefactory.logiccircuitsimulatorpro.R.layout.abc_expanded_menu_layout, (ViewGroup) oVar2, false);
                        if (iVar2.f13419t == null) {
                            iVar2.f13419t = new k.h(iVar2);
                        }
                        iVar2.f13417r.setAdapter((ListAdapter) iVar2.f13419t);
                        iVar2.f13417r.setOnItemClickListener(iVar2);
                    }
                    ExpandedMenuView expandedMenuView = iVar2.f13417r;
                    pVar.f12857f = expandedMenuView;
                    if (expandedMenuView == null) {
                        return;
                    }
                }
                if (pVar.f12857f == null) {
                    return;
                }
                if (pVar.f12858g == null) {
                    k.i iVar3 = pVar.f12860i;
                    if (iVar3.f13419t == null) {
                        iVar3.f13419t = new k.h(iVar3);
                    }
                    if (iVar3.f13419t.getCount() <= 0) {
                        return;
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = pVar.f12857f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                pVar.f12856e.setBackgroundResource(pVar.f12855b);
                ViewParent parent = pVar.f12857f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(pVar.f12857f);
                }
                pVar.f12856e.addView(pVar.f12857f, layoutParams2);
                if (!pVar.f12857f.hasFocus()) {
                    pVar.f12857f.requestFocus();
                }
            } else {
                View view2 = pVar.f12858g;
                if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
                    i4 = -1;
                    pVar.f12863l = false;
                    WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i4, -2, 0, 0, 1002, 8519680, -3);
                    layoutParams3.gravity = pVar.c;
                    layoutParams3.windowAnimations = pVar.d;
                    windowManager.addView(pVar.f12856e, layoutParams3);
                    pVar.f12864m = true;
                }
            }
            i4 = -2;
            pVar.f12863l = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i4, -2, 0, 0, 1002, 8519680, -3);
            layoutParams32.gravity = pVar.c;
            layoutParams32.windowAnimations = pVar.d;
            windowManager.addView(pVar.f12856e, layoutParams32);
            pVar.f12864m = true;
        }
    }

    public final boolean x(p pVar, int i4, KeyEvent keyEvent) {
        k.m mVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((pVar.f12862k || y(pVar, keyEvent)) && (mVar = pVar.f12859h) != null) {
            return mVar.performShortcut(i4, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cd, code lost:
    
        if (r13.f12859h == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(f.p r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.q.y(f.p, android.view.KeyEvent):boolean");
    }

    public final void z() {
        if (this.f12878H) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }
}
