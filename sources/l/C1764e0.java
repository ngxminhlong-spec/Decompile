package l;

import C0.ViewOnTouchListenerC0007g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import e.AbstractC1657a;
import g.AbstractC1678a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.InterfaceC1743D;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1764e0 implements InterfaceC1743D {
    public static final Method N;

    /* renamed from: O, reason: collision with root package name */
    public static final Method f13726O;

    /* renamed from: P, reason: collision with root package name */
    public static final Method f13727P;

    /* renamed from: B, reason: collision with root package name */
    public K.b f13729B;

    /* renamed from: C, reason: collision with root package name */
    public View f13730C;

    /* renamed from: D, reason: collision with root package name */
    public AdapterView.OnItemClickListener f13731D;

    /* renamed from: I, reason: collision with root package name */
    public final Handler f13736I;

    /* renamed from: K, reason: collision with root package name */
    public Rect f13738K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f13739L;

    /* renamed from: M, reason: collision with root package name */
    public final C1788v f13740M;

    /* renamed from: o, reason: collision with root package name */
    public final Context f13741o;

    /* renamed from: p, reason: collision with root package name */
    public ListAdapter f13742p;

    /* renamed from: q, reason: collision with root package name */
    public V f13743q;

    /* renamed from: t, reason: collision with root package name */
    public int f13746t;

    /* renamed from: u, reason: collision with root package name */
    public int f13747u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13749w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f13750x;
    public boolean y;

    /* renamed from: r, reason: collision with root package name */
    public final int f13744r = -2;

    /* renamed from: s, reason: collision with root package name */
    public int f13745s = -2;

    /* renamed from: v, reason: collision with root package name */
    public final int f13748v = 1002;

    /* renamed from: z, reason: collision with root package name */
    public int f13751z = 0;

    /* renamed from: A, reason: collision with root package name */
    public final int f13728A = Integer.MAX_VALUE;

    /* renamed from: E, reason: collision with root package name */
    public final RunnableC1760c0 f13732E = new RunnableC1760c0(this, 1);

    /* renamed from: F, reason: collision with root package name */
    public final ViewOnTouchListenerC0007g f13733F = new ViewOnTouchListenerC0007g(2, this);

    /* renamed from: G, reason: collision with root package name */
    public final C1762d0 f13734G = new C1762d0(this);

    /* renamed from: H, reason: collision with root package name */
    public final RunnableC1760c0 f13735H = new RunnableC1760c0(this, 0);

    /* renamed from: J, reason: collision with root package name */
    public final Rect f13737J = new Rect();

    static {
        int i4 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i4 <= 28) {
            try {
                N = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f13727P = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f13726O = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [l.v, android.widget.PopupWindow] */
    public C1764e0(Context context, AttributeSet attributeSet, int i4, int i5) {
        int resourceId;
        this.f13741o = context;
        this.f13736I = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1657a.f12647o, i4, 0);
        this.f13746t = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f13747u = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f13749w = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i4, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1657a.f12651s, i4, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        popupWindow.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : AbstractC1678a.a(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.f13740M = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    @Override // k.InterfaceC1743D
    public final boolean b() {
        return this.f13740M.isShowing();
    }

    public final int c() {
        return this.f13746t;
    }

    @Override // k.InterfaceC1743D
    public final void dismiss() {
        C1788v c1788v = this.f13740M;
        c1788v.dismiss();
        c1788v.setContentView(null);
        this.f13743q = null;
        this.f13736I.removeCallbacks(this.f13732E);
    }

    @Override // k.InterfaceC1743D
    public final void e() {
        int i4;
        int maxAvailableHeight;
        int paddingBottom;
        V v4;
        V v5 = this.f13743q;
        Context context = this.f13741o;
        C1788v c1788v = this.f13740M;
        if (v5 == null) {
            V q4 = q(context, !this.f13739L);
            this.f13743q = q4;
            q4.setAdapter(this.f13742p);
            this.f13743q.setOnItemClickListener(this.f13731D);
            this.f13743q.setFocusable(true);
            this.f13743q.setFocusableInTouchMode(true);
            this.f13743q.setOnItemSelectedListener(new C1758b0(0, this));
            this.f13743q.setOnScrollListener(this.f13734G);
            c1788v.setContentView(this.f13743q);
        }
        Drawable background = c1788v.getBackground();
        Rect rect = this.f13737J;
        if (background != null) {
            background.getPadding(rect);
            int i5 = rect.top;
            i4 = rect.bottom + i5;
            if (!this.f13749w) {
                this.f13747u = -i5;
            }
        } else {
            rect.setEmpty();
            i4 = 0;
        }
        boolean z4 = c1788v.getInputMethodMode() == 2;
        View view = this.f13730C;
        int i6 = this.f13747u;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f13726O;
            if (method != null) {
                try {
                    maxAvailableHeight = ((Integer) method.invoke(c1788v, view, Integer.valueOf(i6), Boolean.valueOf(z4))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            maxAvailableHeight = c1788v.getMaxAvailableHeight(view, i6);
        } else {
            maxAvailableHeight = c1788v.getMaxAvailableHeight(view, i6, z4);
        }
        int i7 = this.f13744r;
        if (i7 == -1) {
            paddingBottom = maxAvailableHeight + i4;
        } else {
            int i8 = this.f13745s;
            int a4 = this.f13743q.a(i8 != -2 ? i8 != -1 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight);
            paddingBottom = a4 + (a4 > 0 ? this.f13743q.getPaddingBottom() + this.f13743q.getPaddingTop() + i4 : 0);
        }
        boolean z5 = c1788v.getInputMethodMode() == 2;
        c1788v.setWindowLayoutType(this.f13748v);
        if (c1788v.isShowing()) {
            View view2 = this.f13730C;
            WeakHashMap weakHashMap = H.A.f779a;
            if (view2.isAttachedToWindow()) {
                int i9 = this.f13745s;
                if (i9 == -1) {
                    i9 = -1;
                } else if (i9 == -2) {
                    i9 = this.f13730C.getWidth();
                }
                if (i7 == -1) {
                    i7 = z5 ? paddingBottom : -1;
                    if (z5) {
                        c1788v.setWidth(this.f13745s == -1 ? -1 : 0);
                        c1788v.setHeight(0);
                    } else {
                        c1788v.setWidth(this.f13745s == -1 ? -1 : 0);
                        c1788v.setHeight(-1);
                    }
                } else if (i7 == -2) {
                    i7 = paddingBottom;
                }
                c1788v.setOutsideTouchable(true);
                View view3 = this.f13730C;
                int i10 = i9;
                int i11 = this.f13746t;
                int i12 = this.f13747u;
                int i13 = i10 < 0 ? -1 : i10;
                if (i7 < 0) {
                    i7 = -1;
                }
                c1788v.update(view3, i11, i12, i13, i7);
                return;
            }
            return;
        }
        int i14 = this.f13745s;
        if (i14 == -1) {
            i14 = -1;
        } else if (i14 == -2) {
            i14 = this.f13730C.getWidth();
        }
        if (i7 == -1) {
            i7 = -1;
        } else if (i7 == -2) {
            i7 = paddingBottom;
        }
        c1788v.setWidth(i14);
        c1788v.setHeight(i7);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = N;
            if (method2 != null) {
                try {
                    method2.invoke(c1788v, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            c1788v.setIsClippedToScreen(true);
        }
        c1788v.setOutsideTouchable(true);
        c1788v.setTouchInterceptor(this.f13733F);
        if (this.y) {
            c1788v.setOverlapAnchor(this.f13750x);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f13727P;
            if (method3 != null) {
                try {
                    method3.invoke(c1788v, this.f13738K);
                } catch (Exception e4) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e4);
                }
            }
        } else {
            c1788v.setEpicenterBounds(this.f13738K);
        }
        c1788v.showAsDropDown(this.f13730C, this.f13746t, this.f13747u, this.f13751z);
        this.f13743q.setSelection(-1);
        if ((!this.f13739L || this.f13743q.isInTouchMode()) && (v4 = this.f13743q) != null) {
            v4.setListSelectionHidden(true);
            v4.requestLayout();
        }
        if (this.f13739L) {
            return;
        }
        this.f13736I.post(this.f13735H);
    }

    public final Drawable f() {
        return this.f13740M.getBackground();
    }

    public final void h(Drawable drawable) {
        this.f13740M.setBackgroundDrawable(drawable);
    }

    @Override // k.InterfaceC1743D
    public final V i() {
        return this.f13743q;
    }

    public final void j(int i4) {
        this.f13747u = i4;
        this.f13749w = true;
    }

    public final void l(int i4) {
        this.f13746t = i4;
    }

    public final int n() {
        if (this.f13749w) {
            return this.f13747u;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        K.b bVar = this.f13729B;
        if (bVar == null) {
            this.f13729B = new K.b(1, this);
        } else {
            ListAdapter listAdapter2 = this.f13742p;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f13742p = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f13729B);
        }
        V v4 = this.f13743q;
        if (v4 != null) {
            v4.setAdapter(this.f13742p);
        }
    }

    public V q(Context context, boolean z4) {
        return new V(context, z4);
    }

    public final void r(int i4) {
        Drawable background = this.f13740M.getBackground();
        if (background == null) {
            this.f13745s = i4;
            return;
        }
        Rect rect = this.f13737J;
        background.getPadding(rect);
        this.f13745s = rect.left + rect.right + i4;
    }
}
