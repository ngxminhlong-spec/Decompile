package androidx.recyclerview.widget;

import B.a;
import H.A;
import H.AbstractC0044t;
import H.AbstractC0046v;
import H.B;
import H.C0031f;
import H.C0034i;
import L.b;
import M.d;
import a0.AbstractC0150a;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import b0.AbstractC0171E;
import b0.AbstractC0175I;
import b0.AbstractC0176J;
import b0.AbstractC0178L;
import b0.AbstractC0180N;
import b0.AbstractC0182P;
import b0.C0169C;
import b0.C0170D;
import b0.C0174H;
import b0.C0179M;
import b0.C0183Q;
import b0.C0184S;
import b0.C0185T;
import b0.C0187V;
import b0.C0188a;
import b0.C0196i;
import b0.C0197j;
import b0.C0206s;
import b0.C0212y;
import b0.InterfaceC0173G;
import b0.InterfaceC0181O;
import b0.InterfaceC0186U;
import b0.RunnableC0168B;
import b0.RunnableC0199l;
import b0.W;
import b0.Z;
import b0.a0;
import b0.b0;
import b0.c0;
import b0.e0;
import b0.o0;
import com.google.android.gms.internal.ads.Tw;
import com.google.android.gms.internal.measurement.C1510e1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q2.e;
import r.g;
import r.i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] J0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: K0, reason: collision with root package name */
    public static final Class[] f3023K0;

    /* renamed from: L0, reason: collision with root package name */
    public static final d f3024L0;

    /* renamed from: A, reason: collision with root package name */
    public AbstractC0178L f3025A;

    /* renamed from: A0, reason: collision with root package name */
    public e0 f3026A0;

    /* renamed from: B, reason: collision with root package name */
    public final ArrayList f3027B;

    /* renamed from: B0, reason: collision with root package name */
    public final int[] f3028B0;

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f3029C;

    /* renamed from: C0, reason: collision with root package name */
    public C0031f f3030C0;

    /* renamed from: D, reason: collision with root package name */
    public InterfaceC0181O f3031D;

    /* renamed from: D0, reason: collision with root package name */
    public final int[] f3032D0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f3033E;

    /* renamed from: E0, reason: collision with root package name */
    public final int[] f3034E0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3035F;

    /* renamed from: F0, reason: collision with root package name */
    public final int[] f3036F0;

    /* renamed from: G, reason: collision with root package name */
    public boolean f3037G;

    /* renamed from: G0, reason: collision with root package name */
    public final ArrayList f3038G0;

    /* renamed from: H, reason: collision with root package name */
    public int f3039H;

    /* renamed from: H0, reason: collision with root package name */
    public final RunnableC0168B f3040H0;

    /* renamed from: I, reason: collision with root package name */
    public boolean f3041I;

    /* renamed from: I0, reason: collision with root package name */
    public final C0169C f3042I0;

    /* renamed from: J, reason: collision with root package name */
    public boolean f3043J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f3044K;

    /* renamed from: L, reason: collision with root package name */
    public int f3045L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f3046M;
    public final AccessibilityManager N;

    /* renamed from: O, reason: collision with root package name */
    public ArrayList f3047O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f3048P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f3049Q;

    /* renamed from: R, reason: collision with root package name */
    public int f3050R;

    /* renamed from: S, reason: collision with root package name */
    public int f3051S;

    /* renamed from: T, reason: collision with root package name */
    public C0174H f3052T;

    /* renamed from: U, reason: collision with root package name */
    public EdgeEffect f3053U;

    /* renamed from: V, reason: collision with root package name */
    public EdgeEffect f3054V;

    /* renamed from: W, reason: collision with root package name */
    public EdgeEffect f3055W;

    /* renamed from: a0, reason: collision with root package name */
    public EdgeEffect f3056a0;

    /* renamed from: b0, reason: collision with root package name */
    public AbstractC0175I f3057b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f3058c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f3059d0;

    /* renamed from: e0, reason: collision with root package name */
    public VelocityTracker f3060e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f3061f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f3062g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f3063h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f3064i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f3065j0;

    /* renamed from: k0, reason: collision with root package name */
    public AbstractC0180N f3066k0;

    /* renamed from: l0, reason: collision with root package name */
    public final int f3067l0;

    /* renamed from: m0, reason: collision with root package name */
    public final int f3068m0;

    /* renamed from: n0, reason: collision with root package name */
    public final float f3069n0;

    /* renamed from: o, reason: collision with root package name */
    public final C0187V f3070o;

    /* renamed from: o0, reason: collision with root package name */
    public final float f3071o0;

    /* renamed from: p, reason: collision with root package name */
    public final C0185T f3072p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f3073p0;

    /* renamed from: q, reason: collision with root package name */
    public W f3074q;

    /* renamed from: q0, reason: collision with root package name */
    public final b0 f3075q0;

    /* renamed from: r, reason: collision with root package name */
    public final Tw f3076r;

    /* renamed from: r0, reason: collision with root package name */
    public RunnableC0199l f3077r0;

    /* renamed from: s, reason: collision with root package name */
    public final e f3078s;

    /* renamed from: s0, reason: collision with root package name */
    public final C0197j f3079s0;

    /* renamed from: t, reason: collision with root package name */
    public final C1510e1 f3080t;

    /* renamed from: t0, reason: collision with root package name */
    public final Z f3081t0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3082u;

    /* renamed from: u0, reason: collision with root package name */
    public AbstractC0182P f3083u0;

    /* renamed from: v, reason: collision with root package name */
    public final RunnableC0168B f3084v;

    /* renamed from: v0, reason: collision with root package name */
    public ArrayList f3085v0;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f3086w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f3087w0;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f3088x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f3089x0;
    public final RectF y;

    /* renamed from: y0, reason: collision with root package name */
    public final C0170D f3090y0;

    /* renamed from: z, reason: collision with root package name */
    public AbstractC0171E f3091z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f3092z0;

    static {
        Class cls = Integer.TYPE;
        f3023K0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f3024L0 = new d(3);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.duracodefactory.logiccircuitsimulatorpro.R.attr.recyclerViewStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [b0.I, b0.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [b0.H, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r3v15, types: [b0.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [b0.Z, java.lang.Object] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        float a4;
        int i5;
        char c;
        TypedArray typedArray;
        boolean z4;
        char c2;
        AttributeSet attributeSet2;
        int i6;
        Constructor constructor;
        this.f3070o = new C0187V(this);
        this.f3072p = new C0185T(this);
        this.f3080t = new C1510e1(11);
        this.f3084v = new RunnableC0168B(this, 0);
        this.f3086w = new Rect();
        this.f3088x = new Rect();
        this.y = new RectF();
        this.f3027B = new ArrayList();
        this.f3029C = new ArrayList();
        this.f3039H = 0;
        this.f3048P = false;
        this.f3049Q = false;
        this.f3050R = 0;
        this.f3051S = 0;
        this.f3052T = new Object();
        ?? obj = new Object();
        Object[] objArr = null;
        obj.f3178a = null;
        obj.f3179b = new ArrayList();
        obj.c = 120L;
        obj.d = 120L;
        obj.f3180e = 250L;
        obj.f3181f = 250L;
        obj.f3280g = true;
        obj.f3281h = new ArrayList();
        obj.f3282i = new ArrayList();
        obj.f3283j = new ArrayList();
        obj.f3284k = new ArrayList();
        obj.f3285l = new ArrayList();
        obj.f3286m = new ArrayList();
        obj.f3287n = new ArrayList();
        obj.f3288o = new ArrayList();
        obj.f3289p = new ArrayList();
        obj.f3290q = new ArrayList();
        obj.f3291r = new ArrayList();
        this.f3057b0 = obj;
        this.f3058c0 = 0;
        this.f3059d0 = -1;
        this.f3069n0 = Float.MIN_VALUE;
        this.f3071o0 = Float.MIN_VALUE;
        this.f3073p0 = true;
        this.f3075q0 = new b0(this);
        this.f3079s0 = new Object();
        ?? obj2 = new Object();
        obj2.f3216a = -1;
        obj2.f3217b = 0;
        obj2.c = 0;
        obj2.d = 1;
        obj2.f3218e = 0;
        obj2.f3219f = false;
        obj2.f3220g = false;
        obj2.f3221h = false;
        obj2.f3222i = false;
        obj2.f3223j = false;
        obj2.f3224k = false;
        this.f3081t0 = obj2;
        this.f3087w0 = false;
        this.f3089x0 = false;
        C0170D c0170d = new C0170D(this);
        this.f3090y0 = c0170d;
        this.f3092z0 = false;
        this.f3028B0 = new int[2];
        this.f3032D0 = new int[2];
        this.f3034E0 = new int[2];
        this.f3036F0 = new int[2];
        this.f3038G0 = new ArrayList();
        this.f3040H0 = new RunnableC0168B(this, 1);
        this.f3042I0 = new C0169C(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3065j0 = viewConfiguration.getScaledTouchSlop();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            Method method = B.f781a;
            a4 = a.c(viewConfiguration);
        } else {
            a4 = B.a(viewConfiguration, context);
        }
        this.f3069n0 = a4;
        this.f3071o0 = i7 >= 26 ? a.d(viewConfiguration) : B.a(viewConfiguration, context);
        this.f3067l0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3068m0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f3057b0.f3178a = c0170d;
        this.f3076r = new Tw(new C0169C(this));
        this.f3078s = new e(new C0170D(this));
        WeakHashMap weakHashMap = A.f779a;
        if ((i7 >= 26 ? AbstractC0046v.a(this) : 0) == 0 && i7 >= 26) {
            AbstractC0046v.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.N = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new e0(this));
        int[] iArr = AbstractC0150a.f2348a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        if (i7 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i4, 0);
        }
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f3082u = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + z());
            }
            Resources resources = getContext().getResources();
            c2 = 2;
            i5 = i4;
            z4 = 1;
            c = 3;
            i6 = 4;
            typedArray = obtainStyledAttributes;
            attributeSet2 = attributeSet;
            new C0196i(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.duracodefactory.logiccircuitsimulatorpro.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.duracodefactory.logiccircuitsimulatorpro.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.duracodefactory.logiccircuitsimulatorpro.R.dimen.fastscroll_margin));
        } else {
            i5 = i4;
            c = 3;
            typedArray = obtainStyledAttributes;
            z4 = 1;
            c2 = 2;
            attributeSet2 = attributeSet;
            i6 = 4;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    Class asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0178L.class);
                    try {
                        constructor = asSubclass.getConstructor(f3023K0);
                        Object[] objArr2 = new Object[i6];
                        objArr2[0] = context;
                        objArr2[z4] = attributeSet2;
                        objArr2[c2] = Integer.valueOf(i5);
                        objArr2[c] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e4) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e5) {
                            e5.initCause(e4);
                            throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Error creating LayoutManager " + str, e5);
                        }
                    }
                    constructor.setAccessible(z4);
                    setLayoutManager((AbstractC0178L) constructor.newInstance(objArr));
                } catch (ClassCastException e6) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Class is not a LayoutManager " + str, e6);
                } catch (ClassNotFoundException e7) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Unable to find LayoutManager " + str, e7);
                } catch (IllegalAccessException e8) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Cannot access non-public constructor " + str, e8);
                } catch (InstantiationException e9) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e9);
                } catch (InvocationTargetException e10) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e10);
                }
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        int[] iArr2 = J0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet2, iArr2, i5, 0);
        if (i8 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet2, obtainStyledAttributes2, i5, 0);
        }
        boolean z5 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z5);
    }

    public static RecyclerView E(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            RecyclerView E4 = E(viewGroup.getChildAt(i4));
            if (E4 != null) {
                return E4;
            }
        }
        return null;
    }

    public static c0 J(View view) {
        if (view == null) {
            return null;
        }
        return ((C0179M) view.getLayoutParams()).f3197a;
    }

    private C0031f getScrollingChildHelper() {
        if (this.f3030C0 == null) {
            this.f3030C0 = new C0031f(this);
        }
        return this.f3030C0;
    }

    public static void j(c0 c0Var) {
        WeakReference weakReference = c0Var.f3245b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == c0Var.f3244a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            c0Var.f3245b = null;
        }
    }

    public final void A(Z z4) {
        if (getScrollState() != 2) {
            z4.getClass();
            return;
        }
        OverScroller overScroller = this.f3075q0.f3235q;
        overScroller.getFinalX();
        overScroller.getCurrX();
        z4.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View B(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.B(android.view.View):android.view.View");
    }

    public final boolean C(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f3029C;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC0181O interfaceC0181O = (InterfaceC0181O) arrayList.get(i4);
            if (interfaceC0181O.b(motionEvent) && action != 3) {
                this.f3031D = interfaceC0181O;
                return true;
            }
        }
        return false;
    }

    public final void D(int[] iArr) {
        int n4 = this.f3078s.n();
        if (n4 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        for (int i6 = 0; i6 < n4; i6++) {
            c0 J4 = J(this.f3078s.m(i6));
            if (!J4.p()) {
                int c = J4.c();
                if (c < i4) {
                    i4 = c;
                }
                if (c > i5) {
                    i5 = c;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
    }

    public final c0 F(int i4) {
        c0 c0Var = null;
        if (this.f3048P) {
            return null;
        }
        int u2 = this.f3078s.u();
        for (int i5 = 0; i5 < u2; i5++) {
            c0 J4 = J(this.f3078s.t(i5));
            if (J4 != null && !J4.i() && G(J4) == i4) {
                if (!((ArrayList) this.f3078s.f14711r).contains(J4.f3244a)) {
                    return J4;
                }
                c0Var = J4;
            }
        }
        return c0Var;
    }

    public final int G(c0 c0Var) {
        if ((c0Var.f3251j & 524) == 0 && c0Var.f()) {
            int i4 = c0Var.c;
            ArrayList arrayList = (ArrayList) this.f3076r.c;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                C0188a c0188a = (C0188a) arrayList.get(i5);
                int i6 = c0188a.f3228a;
                if (i6 != 1) {
                    if (i6 == 2) {
                        int i7 = c0188a.f3229b;
                        if (i7 <= i4) {
                            int i8 = c0188a.d;
                            if (i7 + i8 <= i4) {
                                i4 -= i8;
                            }
                        } else {
                            continue;
                        }
                    } else if (i6 == 8) {
                        int i9 = c0188a.f3229b;
                        if (i9 == i4) {
                            i4 = c0188a.d;
                        } else {
                            if (i9 < i4) {
                                i4--;
                            }
                            if (c0188a.d <= i4) {
                                i4++;
                            }
                        }
                    }
                } else if (c0188a.f3229b <= i4) {
                    i4 += c0188a.d;
                }
            }
            return i4;
        }
        return -1;
    }

    public final long H(c0 c0Var) {
        return this.f3091z.f3177b ? c0Var.f3246e : c0Var.c;
    }

    public final c0 I(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return J(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect K(View view) {
        C0179M c0179m = (C0179M) view.getLayoutParams();
        boolean z4 = c0179m.c;
        Rect rect = c0179m.f3198b;
        if (!z4 || (this.f3081t0.f3220g && (c0179m.f3197a.l() || c0179m.f3197a.g()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f3027B;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Rect rect2 = this.f3086w;
            rect2.set(0, 0, 0, 0);
            ((AbstractC0176J) arrayList.get(i4)).d(rect2, view);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0179m.c = false;
        return rect;
    }

    public final boolean L() {
        return !this.f3037G || this.f3048P || this.f3076r.k();
    }

    public final boolean M() {
        return this.f3050R > 0;
    }

    public final void N(int i4) {
        if (this.f3025A == null) {
            return;
        }
        setScrollState(2);
        this.f3025A.m0(i4);
        awakenScrollBars();
    }

    public final void O() {
        int u2 = this.f3078s.u();
        for (int i4 = 0; i4 < u2; i4++) {
            ((C0179M) this.f3078s.t(i4).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.f3072p.c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0179M c0179m = (C0179M) ((c0) arrayList.get(i5)).f3244a.getLayoutParams();
            if (c0179m != null) {
                c0179m.c = true;
            }
        }
    }

    public final void P(int i4, int i5, boolean z4) {
        int i6 = i4 + i5;
        int u2 = this.f3078s.u();
        for (int i7 = 0; i7 < u2; i7++) {
            c0 J4 = J(this.f3078s.t(i7));
            if (J4 != null && !J4.p()) {
                int i8 = J4.c;
                Z z5 = this.f3081t0;
                if (i8 >= i6) {
                    J4.m(-i5, z4);
                    z5.f3219f = true;
                } else if (i8 >= i4) {
                    J4.a(8);
                    J4.m(-i5, z4);
                    J4.c = i4 - 1;
                    z5.f3219f = true;
                }
            }
        }
        C0185T c0185t = this.f3072p;
        ArrayList arrayList = c0185t.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c0 c0Var = (c0) arrayList.get(size);
            if (c0Var != null) {
                int i9 = c0Var.c;
                if (i9 >= i6) {
                    c0Var.m(-i5, z4);
                } else if (i9 >= i4) {
                    c0Var.a(8);
                    c0185t.e(size);
                }
            }
        }
        requestLayout();
    }

    public final void Q() {
        this.f3050R++;
    }

    public final void R(boolean z4) {
        int i4;
        AccessibilityManager accessibilityManager;
        int i5 = this.f3050R - 1;
        this.f3050R = i5;
        if (i5 < 1) {
            this.f3050R = 0;
            if (z4) {
                int i6 = this.f3045L;
                this.f3045L = 0;
                if (i6 != 0 && (accessibilityManager = this.N) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i6);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f3038G0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c0 c0Var = (c0) arrayList.get(size);
                    if (c0Var.f3244a.getParent() == this && !c0Var.p() && (i4 = c0Var.f3258q) != -1) {
                        View view = c0Var.f3244a;
                        WeakHashMap weakHashMap = A.f779a;
                        view.setImportantForAccessibility(i4);
                        c0Var.f3258q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void S(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3059d0) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.f3059d0 = motionEvent.getPointerId(i4);
            int x4 = (int) (motionEvent.getX(i4) + 0.5f);
            this.f3063h0 = x4;
            this.f3061f0 = x4;
            int y = (int) (motionEvent.getY(i4) + 0.5f);
            this.f3064i0 = y;
            this.f3062g0 = y;
        }
    }

    public final void T() {
        if (this.f3092z0 || !this.f3033E) {
            return;
        }
        WeakHashMap weakHashMap = A.f779a;
        postOnAnimation(this.f3040H0);
        this.f3092z0 = true;
    }

    public final void U() {
        boolean z4;
        boolean z5 = false;
        if (this.f3048P) {
            Tw tw = this.f3076r;
            tw.s((ArrayList) tw.c);
            tw.s((ArrayList) tw.d);
            tw.f7098a = 0;
            if (this.f3049Q) {
                this.f3025A.W();
            }
        }
        if (this.f3057b0 == null || !this.f3025A.y0()) {
            this.f3076r.d();
        } else {
            this.f3076r.r();
        }
        boolean z6 = this.f3087w0 || this.f3089x0;
        boolean z7 = this.f3037G && this.f3057b0 != null && ((z4 = this.f3048P) || z6 || this.f3025A.f3187f) && (!z4 || this.f3091z.f3177b);
        Z z8 = this.f3081t0;
        z8.f3223j = z7;
        if (z7 && z6 && !this.f3048P && this.f3057b0 != null && this.f3025A.y0()) {
            z5 = true;
        }
        z8.f3224k = z5;
    }

    public final void V(boolean z4) {
        this.f3049Q = z4 | this.f3049Q;
        this.f3048P = true;
        int u2 = this.f3078s.u();
        for (int i4 = 0; i4 < u2; i4++) {
            c0 J4 = J(this.f3078s.t(i4));
            if (J4 != null && !J4.p()) {
                J4.a(6);
            }
        }
        O();
        C0185T c0185t = this.f3072p;
        ArrayList arrayList = c0185t.c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            c0 c0Var = (c0) arrayList.get(i5);
            if (c0Var != null) {
                c0Var.a(6);
                c0Var.a(1024);
            }
        }
        AbstractC0171E abstractC0171E = c0185t.f3208h.f3091z;
        if (abstractC0171E == null || !abstractC0171E.f3177b) {
            c0185t.d();
        }
    }

    public final void W(c0 c0Var, C0034i c0034i) {
        c0Var.f3251j &= -8193;
        boolean z4 = this.f3081t0.f3221h;
        C1510e1 c1510e1 = this.f3080t;
        if (z4 && c0Var.l() && !c0Var.i() && !c0Var.p()) {
            ((g) c1510e1.f11915q).g(H(c0Var), c0Var);
        }
        i iVar = (i) c1510e1.f11914p;
        o0 o0Var = (o0) iVar.get(c0Var);
        if (o0Var == null) {
            o0Var = o0.a();
            iVar.put(c0Var, o0Var);
        }
        o0Var.f3376b = c0034i;
        o0Var.f3375a |= 4;
    }

    public final void X(AbstractC0176J abstractC0176J) {
        AbstractC0178L abstractC0178L = this.f3025A;
        if (abstractC0178L != null) {
            abstractC0178L.c("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f3027B;
        arrayList.remove(abstractC0176J);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        O();
        requestLayout();
    }

    public final void Y(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f3086w;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0179M) {
            C0179M c0179m = (C0179M) layoutParams;
            if (!c0179m.c) {
                Rect rect2 = c0179m.f3198b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f3025A.j0(this, view, this.f3086w, !this.f3037G, view2 == null);
    }

    public final void Z() {
        VelocityTracker velocityTracker = this.f3060e0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z4 = false;
        g0(0);
        EdgeEffect edgeEffect = this.f3053U;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z4 = this.f3053U.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3054V;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z4 |= this.f3054V.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3055W;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z4 |= this.f3055W.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3056a0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z4 |= this.f3056a0.isFinished();
        }
        if (z4) {
            WeakHashMap weakHashMap = A.f779a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a0(int r18, int r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.a0(int, int, android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i4, int i5) {
        AbstractC0178L abstractC0178L = this.f3025A;
        if (abstractC0178L != null) {
            abstractC0178L.getClass();
        }
        super.addFocusables(arrayList, i4, i5);
    }

    public final void b0(int i4, int i5, int[] iArr) {
        c0 c0Var;
        e0();
        Q();
        int i6 = D.i.f528a;
        Trace.beginSection("RV Scroll");
        Z z4 = this.f3081t0;
        A(z4);
        C0185T c0185t = this.f3072p;
        int l02 = i4 != 0 ? this.f3025A.l0(i4, c0185t, z4) : 0;
        int n02 = i5 != 0 ? this.f3025A.n0(i5, c0185t, z4) : 0;
        Trace.endSection();
        e eVar = this.f3078s;
        int n4 = eVar.n();
        for (int i7 = 0; i7 < n4; i7++) {
            View m4 = eVar.m(i7);
            c0 I4 = I(m4);
            if (I4 != null && (c0Var = I4.f3250i) != null) {
                View view = c0Var.f3244a;
                int left = m4.getLeft();
                int top = m4.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        R(true);
        f0(false);
        if (iArr != null) {
            iArr[0] = l02;
            iArr[1] = n02;
        }
    }

    public final void c0(int i4) {
        C0212y c0212y;
        if (this.f3043J) {
            return;
        }
        setScrollState(0);
        b0 b0Var = this.f3075q0;
        b0Var.f3239u.removeCallbacks(b0Var);
        b0Var.f3235q.abortAnimation();
        AbstractC0178L abstractC0178L = this.f3025A;
        if (abstractC0178L != null && (c0212y = abstractC0178L.f3186e) != null) {
            c0212y.g();
        }
        AbstractC0178L abstractC0178L2 = this.f3025A;
        if (abstractC0178L2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0178L2.m0(i4);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0179M) && this.f3025A.f((C0179M) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0178L abstractC0178L = this.f3025A;
        if (abstractC0178L != null && abstractC0178L.d()) {
            return this.f3025A.j(this.f3081t0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0178L abstractC0178L = this.f3025A;
        if (abstractC0178L != null && abstractC0178L.d()) {
            return this.f3025A.k(this.f3081t0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0178L abstractC0178L = this.f3025A;
        if (abstractC0178L != null && abstractC0178L.d()) {
            return this.f3025A.l(this.f3081t0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0178L abstractC0178L = this.f3025A;
        if (abstractC0178L != null && abstractC0178L.e()) {
            return this.f3025A.m(this.f3081t0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0178L abstractC0178L = this.f3025A;
        if (abstractC0178L != null && abstractC0178L.e()) {
            return this.f3025A.n(this.f3081t0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0178L abstractC0178L = this.f3025A;
        if (abstractC0178L != null && abstractC0178L.e()) {
            return this.f3025A.o(this.f3081t0);
        }
        return 0;
    }

    public final void d0(int i4, int i5, boolean z4) {
        AbstractC0178L abstractC0178L = this.f3025A;
        if (abstractC0178L == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f3043J) {
            return;
        }
        if (!abstractC0178L.d()) {
            i4 = 0;
        }
        if (!this.f3025A.e()) {
            i5 = 0;
        }
        if (i4 == 0 && i5 == 0) {
            return;
        }
        if (z4) {
            int i6 = i4 != 0 ? 1 : 0;
            if (i5 != 0) {
                i6 |= 2;
            }
            getScrollingChildHelper().g(i6, 1);
        }
        this.f3075q0.b(i4, i5, Integer.MIN_VALUE, null);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f4, float f5, boolean z4) {
        return getScrollingChildHelper().a(f4, f5, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f4, float f5) {
        return getScrollingChildHelper().b(f4, f5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i5, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return getScrollingChildHelper().d(i4, i5, i6, i7, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z4;
        super.draw(canvas);
        ArrayList arrayList = this.f3027B;
        int size = arrayList.size();
        boolean z5 = false;
        for (int i4 = 0; i4 < size; i4++) {
            ((AbstractC0176J) arrayList.get(i4)).f(canvas, this);
        }
        EdgeEffect edgeEffect = this.f3053U;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z4 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f3082u ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f3053U;
            z4 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f3054V;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f3082u) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f3054V;
            z4 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f3055W;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3082u ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f3055W;
            z4 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f3056a0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3082u) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f3056a0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z5 = true;
            }
            z4 |= z5;
            canvas.restoreToCount(save4);
        }
        if ((z4 || this.f3057b0 == null || arrayList.size() <= 0 || !this.f3057b0.f()) ? z4 : true) {
            WeakHashMap weakHashMap = A.f779a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        return super.drawChild(canvas, view, j4);
    }

    public final void e0() {
        int i4 = this.f3039H + 1;
        this.f3039H = i4;
        if (i4 != 1 || this.f3043J) {
            return;
        }
        this.f3041I = false;
    }

    public final void f(c0 c0Var) {
        View view = c0Var.f3244a;
        boolean z4 = view.getParent() == this;
        this.f3072p.j(I(view));
        if (c0Var.k()) {
            this.f3078s.h(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z4) {
            this.f3078s.g(view, -1, true);
            return;
        }
        e eVar = this.f3078s;
        int indexOfChild = ((C0170D) eVar.f14709p).f3175a.indexOfChild(view);
        if (indexOfChild >= 0) {
            ((N1.d) eVar.f14710q).p(indexOfChild);
            eVar.v(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void f0(boolean z4) {
        if (this.f3039H < 1) {
            this.f3039H = 1;
        }
        if (!z4 && !this.f3043J) {
            this.f3041I = false;
        }
        if (this.f3039H == 1) {
            if (z4 && this.f3041I && !this.f3043J && this.f3025A != null && this.f3091z != null) {
                p();
            }
            if (!this.f3043J) {
                this.f3041I = false;
            }
        }
        this.f3039H--;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0194, code lost:
    
        if ((r5 * r6) < 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x019c, code lost:
    
        if ((r5 * r6) > 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0166, code lost:
    
        if (r7 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0186, code lost:
    
        if (r5 > 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0189, code lost:
    
        if (r7 < 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018c, code lost:
    
        if (r5 < 0) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dd  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(AbstractC0176J abstractC0176J) {
        AbstractC0178L abstractC0178L = this.f3025A;
        if (abstractC0178L != null) {
            abstractC0178L.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f3027B;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0176J);
        O();
        requestLayout();
    }

    public final void g0(int i4) {
        getScrollingChildHelper().h(i4);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0178L abstractC0178L = this.f3025A;
        if (abstractC0178L != null) {
            return abstractC0178L.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + z());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0178L abstractC0178L = this.f3025A;
        if (abstractC0178L != null) {
            return abstractC0178L.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + z());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0178L abstractC0178L = this.f3025A;
        if (abstractC0178L != null) {
            return abstractC0178L.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + z());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0171E getAdapter() {
        return this.f3091z;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0178L abstractC0178L = this.f3025A;
        if (abstractC0178L == null) {
            return super.getBaseline();
        }
        abstractC0178L.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i4, int i5) {
        return super.getChildDrawingOrder(i4, i5);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f3082u;
    }

    public e0 getCompatAccessibilityDelegate() {
        return this.f3026A0;
    }

    public C0174H getEdgeEffectFactory() {
        return this.f3052T;
    }

    public AbstractC0175I getItemAnimator() {
        return this.f3057b0;
    }

    public int getItemDecorationCount() {
        return this.f3027B.size();
    }

    public AbstractC0178L getLayoutManager() {
        return this.f3025A;
    }

    public int getMaxFlingVelocity() {
        return this.f3068m0;
    }

    public int getMinFlingVelocity() {
        return this.f3067l0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public AbstractC0180N getOnFlingListener() {
        return this.f3066k0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3073p0;
    }

    public C0184S getRecycledViewPool() {
        return this.f3072p.c();
    }

    public int getScrollState() {
        return this.f3058c0;
    }

    public final void h(AbstractC0182P abstractC0182P) {
        if (this.f3085v0 == null) {
            this.f3085v0 = new ArrayList();
        }
        this.f3085v0.add(abstractC0182P);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (M()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + z());
        }
        if (this.f3051S > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + z()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f3033E;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f3043J;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        int u2 = this.f3078s.u();
        for (int i4 = 0; i4 < u2; i4++) {
            c0 J4 = J(this.f3078s.t(i4));
            if (!J4.p()) {
                J4.d = -1;
                J4.f3248g = -1;
            }
        }
        C0185T c0185t = this.f3072p;
        ArrayList arrayList = c0185t.f3203a;
        ArrayList arrayList2 = c0185t.c;
        int size = arrayList2.size();
        for (int i5 = 0; i5 < size; i5++) {
            c0 c0Var = (c0) arrayList2.get(i5);
            c0Var.d = -1;
            c0Var.f3248g = -1;
        }
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            c0 c0Var2 = (c0) arrayList.get(i6);
            c0Var2.d = -1;
            c0Var2.f3248g = -1;
        }
        ArrayList arrayList3 = c0185t.f3204b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i7 = 0; i7 < size3; i7++) {
                c0 c0Var3 = (c0) c0185t.f3204b.get(i7);
                c0Var3.d = -1;
                c0Var3.f3248g = -1;
            }
        }
    }

    public final void l(int i4, int i5) {
        boolean z4;
        EdgeEffect edgeEffect = this.f3053U;
        if (edgeEffect == null || edgeEffect.isFinished() || i4 <= 0) {
            z4 = false;
        } else {
            this.f3053U.onRelease();
            z4 = this.f3053U.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3055W;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i4 < 0) {
            this.f3055W.onRelease();
            z4 |= this.f3055W.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3054V;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i5 > 0) {
            this.f3054V.onRelease();
            z4 |= this.f3054V.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3056a0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i5 < 0) {
            this.f3056a0.onRelease();
            z4 |= this.f3056a0.isFinished();
        }
        if (z4) {
            WeakHashMap weakHashMap = A.f779a;
            postInvalidateOnAnimation();
        }
    }

    public final void m() {
        if (!this.f3037G || this.f3048P) {
            int i4 = D.i.f528a;
            Trace.beginSection("RV FullInvalidate");
            p();
            Trace.endSection();
            return;
        }
        Tw tw = this.f3076r;
        if (tw.k()) {
            int i5 = tw.f7098a;
            if ((i5 & 4) == 0 || (i5 & 11) != 0) {
                if (tw.k()) {
                    int i6 = D.i.f528a;
                    Trace.beginSection("RV FullInvalidate");
                    p();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i7 = D.i.f528a;
            Trace.beginSection("RV PartialInvalidate");
            e0();
            Q();
            tw.r();
            if (!this.f3041I) {
                e eVar = this.f3078s;
                int n4 = eVar.n();
                int i8 = 0;
                while (true) {
                    if (i8 < n4) {
                        c0 J4 = J(eVar.m(i8));
                        if (J4 != null && !J4.p() && J4.l()) {
                            p();
                            break;
                        }
                        i8++;
                    } else {
                        tw.c();
                        break;
                    }
                }
            }
            f0(true);
            R(true);
            Trace.endSection();
        }
    }

    public final void n(int i4, int i5) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = A.f779a;
        setMeasuredDimension(AbstractC0178L.g(i4, paddingRight, getMinimumWidth()), AbstractC0178L.g(i5, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void o(View view) {
        J(view);
        ArrayList arrayList = this.f3047O;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C0206s c0206s = (C0206s) this.f3047O.get(size);
                c0206s.n(view);
                c0 I4 = c0206s.f3399q.I(view);
                if (I4 != null) {
                    c0 c0Var = c0206s.c;
                    if (c0Var == null || I4 != c0Var) {
                        c0206s.i(I4, false);
                        if (c0206s.f3385a.remove(I4.f3244a)) {
                            c0206s.f3395m.e(I4);
                        }
                    } else {
                        c0206s.o(null, 0);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r1 >= 30.0f) goto L20;
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [b0.l, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f3050R = r0
            r1 = 1
            r5.f3033E = r1
            boolean r2 = r5.f3037G
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f3037G = r2
            b0.L r2 = r5.f3025A
            if (r2 == 0) goto L1e
            r2.f3188g = r1
        L1e:
            r5.f3092z0 = r0
            java.lang.ThreadLocal r0 = b0.RunnableC0199l.f3344s
            java.lang.Object r1 = r0.get()
            b0.l r1 = (b0.RunnableC0199l) r1
            r5.f3077r0 = r1
            if (r1 != 0) goto L68
            b0.l r1 = new b0.l
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f3346o = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f3349r = r2
            r5.f3077r0 = r1
            java.util.WeakHashMap r1 = H.A.f779a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5a
            if (r1 == 0) goto L5a
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5a
            goto L5c
        L5a:
            r1 = 1114636288(0x42700000, float:60.0)
        L5c:
            b0.l r2 = r5.f3077r0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f3348q = r3
            r0.set(r2)
        L68:
            b0.l r0 = r5.f3077r0
            java.util.ArrayList r0 = r0.f3346o
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0212y c0212y;
        super.onDetachedFromWindow();
        AbstractC0175I abstractC0175I = this.f3057b0;
        if (abstractC0175I != null) {
            abstractC0175I.e();
        }
        setScrollState(0);
        b0 b0Var = this.f3075q0;
        b0Var.f3239u.removeCallbacks(b0Var);
        b0Var.f3235q.abortAnimation();
        AbstractC0178L abstractC0178L = this.f3025A;
        if (abstractC0178L != null && (c0212y = abstractC0178L.f3186e) != null) {
            c0212y.g();
        }
        this.f3033E = false;
        AbstractC0178L abstractC0178L2 = this.f3025A;
        if (abstractC0178L2 != null) {
            abstractC0178L2.f3188g = false;
            abstractC0178L2.Q(this);
        }
        this.f3038G0.clear();
        removeCallbacks(this.f3040H0);
        this.f3080t.getClass();
        do {
        } while (o0.d.h() != null);
        RunnableC0199l runnableC0199l = this.f3077r0;
        if (runnableC0199l != null) {
            runnableC0199l.f3346o.remove(this);
            this.f3077r0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f3027B;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((AbstractC0176J) arrayList.get(i4)).e(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            b0.L r0 = r5.f3025A
            r1 = 0
            if (r0 != 0) goto L7
            goto L79
        L7:
            boolean r0 = r5.f3043J
            if (r0 == 0) goto Ld
            goto L79
        Ld:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L79
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L40
            b0.L r0 = r5.f3025A
            boolean r0 = r0.e()
            if (r0 == 0) goto L2e
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2f
        L2e:
            r0 = r2
        L2f:
            b0.L r3 = r5.f3025A
            boolean r3 = r3.d()
            if (r3 == 0) goto L3e
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L66
        L3e:
            r3 = r2
            goto L66
        L40:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L64
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            b0.L r3 = r5.f3025A
            boolean r3 = r3.e()
            if (r3 == 0) goto L59
            float r0 = -r0
            goto L3e
        L59:
            b0.L r3 = r5.f3025A
            boolean r3 = r3.d()
            if (r3 == 0) goto L64
            r3 = r0
            r0 = r2
            goto L66
        L64:
            r0 = r2
            r3 = r0
        L66:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6e
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L79
        L6e:
            float r2 = r5.f3069n0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f3071o0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.a0(r2, r0, r6)
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        if (!this.f3043J) {
            this.f3031D = null;
            if (C(motionEvent)) {
                Z();
                setScrollState(0);
                return true;
            }
            AbstractC0178L abstractC0178L = this.f3025A;
            if (abstractC0178L != null) {
                boolean d = abstractC0178L.d();
                boolean e4 = this.f3025A.e();
                if (this.f3060e0 == null) {
                    this.f3060e0 = VelocityTracker.obtain();
                }
                this.f3060e0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f3044K) {
                        this.f3044K = false;
                    }
                    this.f3059d0 = motionEvent.getPointerId(0);
                    int x4 = (int) (motionEvent.getX() + 0.5f);
                    this.f3063h0 = x4;
                    this.f3061f0 = x4;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f3064i0 = y;
                    this.f3062g0 = y;
                    if (this.f3058c0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        g0(1);
                    }
                    int[] iArr = this.f3034E0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i4 = d;
                    if (e4) {
                        i4 = (d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i4, 0);
                } else if (actionMasked == 1) {
                    this.f3060e0.clear();
                    g0(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3059d0);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3059d0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x5 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f3058c0 != 1) {
                        int i5 = x5 - this.f3061f0;
                        int i6 = y4 - this.f3062g0;
                        if (d == 0 || Math.abs(i5) <= this.f3065j0) {
                            z4 = false;
                        } else {
                            this.f3063h0 = x5;
                            z4 = true;
                        }
                        if (e4 && Math.abs(i6) > this.f3065j0) {
                            this.f3064i0 = y4;
                            z4 = true;
                        }
                        if (z4) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    Z();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f3059d0 = motionEvent.getPointerId(actionIndex);
                    int x6 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f3063h0 = x6;
                    this.f3061f0 = x6;
                    int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f3064i0 = y5;
                    this.f3062g0 = y5;
                } else if (actionMasked == 6) {
                    S(motionEvent);
                }
                if (this.f3058c0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i8 = D.i.f528a;
        Trace.beginSection("RV OnLayout");
        p();
        Trace.endSection();
        this.f3037G = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        AbstractC0178L abstractC0178L = this.f3025A;
        if (abstractC0178L == null) {
            n(i4, i5);
            return;
        }
        boolean L4 = abstractC0178L.L();
        Z z4 = this.f3081t0;
        if (L4) {
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            this.f3025A.f3185b.n(i4, i5);
            if ((mode == 1073741824 && mode2 == 1073741824) || this.f3091z == null) {
                return;
            }
            if (z4.d == 1) {
                q();
            }
            this.f3025A.p0(i4, i5);
            z4.f3222i = true;
            r();
            this.f3025A.r0(i4, i5);
            if (this.f3025A.u0()) {
                this.f3025A.p0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                z4.f3222i = true;
                r();
                this.f3025A.r0(i4, i5);
                return;
            }
            return;
        }
        if (this.f3035F) {
            this.f3025A.f3185b.n(i4, i5);
            return;
        }
        if (this.f3046M) {
            e0();
            Q();
            U();
            R(true);
            if (z4.f3224k) {
                z4.f3220g = true;
            } else {
                this.f3076r.d();
                z4.f3220g = false;
            }
            this.f3046M = false;
            f0(false);
        } else if (z4.f3224k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0171E abstractC0171E = this.f3091z;
        if (abstractC0171E != null) {
            z4.f3218e = abstractC0171E.a();
        } else {
            z4.f3218e = 0;
        }
        e0();
        this.f3025A.f3185b.n(i4, i5);
        f0(false);
        z4.f3220g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (M()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i4, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof W)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        W w2 = (W) parcelable;
        this.f3074q = w2;
        super.onRestoreInstanceState(w2.f1071o);
        AbstractC0178L abstractC0178L = this.f3025A;
        if (abstractC0178L == null || (parcelable2 = this.f3074q.f3210q) == null) {
            return;
        }
        abstractC0178L.c0(parcelable2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [L.b, android.os.Parcelable, b0.W] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new b(super.onSaveInstanceState());
        W w2 = this.f3074q;
        if (w2 != null) {
            bVar.f3210q = w2.f3210q;
            return bVar;
        }
        AbstractC0178L abstractC0178L = this.f3025A;
        if (abstractC0178L != null) {
            bVar.f3210q = abstractC0178L.d0();
            return bVar;
        }
        bVar.f3210q = null;
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 == i6 && i5 == i7) {
            return;
        }
        this.f3056a0 = null;
        this.f3054V = null;
        this.f3055W = null;
        this.f3053U = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r29) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0335, code lost:
    
        if (((java.util.ArrayList) r21.f3078s.f14711r).contains(getFocusedChild()) == false) goto L216;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03e1  */
    /* JADX WARN: Type inference failed for: r13v9, types: [H.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.internal.measurement.e1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [H.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [H.i, java.lang.Object] */
    public final void q() {
        o0 o0Var;
        View B4;
        Z z4 = this.f3081t0;
        z4.a(1);
        A(z4);
        z4.f3222i = false;
        e0();
        C1510e1 c1510e1 = this.f3080t;
        i iVar = (i) c1510e1.f11914p;
        i iVar2 = (i) c1510e1.f11914p;
        iVar.clear();
        g gVar = (g) c1510e1.f11915q;
        gVar.b();
        Q();
        U();
        c0 c0Var = null;
        View focusedChild = (this.f3073p0 && hasFocus() && this.f3091z != null) ? getFocusedChild() : null;
        if (focusedChild != null && (B4 = B(focusedChild)) != null) {
            c0Var = I(B4);
        }
        if (c0Var == null) {
            z4.f3226m = -1L;
            z4.f3225l = -1;
            z4.f3227n = -1;
        } else {
            z4.f3226m = this.f3091z.f3177b ? c0Var.f3246e : -1L;
            z4.f3225l = this.f3048P ? -1 : c0Var.i() ? c0Var.d : c0Var.b();
            View view = c0Var.f3244a;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            z4.f3227n = id;
        }
        z4.f3221h = z4.f3223j && this.f3089x0;
        this.f3089x0 = false;
        this.f3087w0 = false;
        z4.f3220g = z4.f3224k;
        z4.f3218e = this.f3091z.a();
        D(this.f3028B0);
        if (z4.f3223j) {
            int n4 = this.f3078s.n();
            for (int i4 = 0; i4 < n4; i4++) {
                c0 J4 = J(this.f3078s.m(i4));
                if (!J4.p() && (!J4.g() || this.f3091z.f3177b)) {
                    AbstractC0175I abstractC0175I = this.f3057b0;
                    AbstractC0175I.b(J4);
                    J4.d();
                    abstractC0175I.getClass();
                    ?? obj = new Object();
                    obj.a(J4);
                    o0 o0Var2 = (o0) iVar2.get(J4);
                    if (o0Var2 == null) {
                        o0Var2 = o0.a();
                        iVar2.put(J4, o0Var2);
                    }
                    o0Var2.f3376b = obj;
                    o0Var2.f3375a |= 4;
                    if (z4.f3221h && J4.l() && !J4.i() && !J4.p() && !J4.g()) {
                        gVar.g(H(J4), J4);
                    }
                }
            }
        }
        if (z4.f3224k) {
            int u2 = this.f3078s.u();
            for (int i5 = 0; i5 < u2; i5++) {
                c0 J5 = J(this.f3078s.t(i5));
                if (!J5.p() && J5.d == -1) {
                    J5.d = J5.c;
                }
            }
            boolean z5 = z4.f3219f;
            z4.f3219f = false;
            this.f3025A.a0(this.f3072p, z4);
            z4.f3219f = z5;
            for (int i6 = 0; i6 < this.f3078s.n(); i6++) {
                c0 J6 = J(this.f3078s.m(i6));
                if (!J6.p() && ((o0Var = (o0) iVar2.get(J6)) == null || (o0Var.f3375a & 4) == 0)) {
                    AbstractC0175I.b(J6);
                    boolean z6 = (J6.f3251j & 8192) != 0;
                    AbstractC0175I abstractC0175I2 = this.f3057b0;
                    J6.d();
                    abstractC0175I2.getClass();
                    ?? obj2 = new Object();
                    obj2.a(J6);
                    if (z6) {
                        W(J6, obj2);
                    } else {
                        o0 o0Var3 = (o0) iVar2.get(J6);
                        if (o0Var3 == null) {
                            o0Var3 = o0.a();
                            iVar2.put(J6, o0Var3);
                        }
                        o0Var3.f3375a |= 2;
                        o0Var3.f3376b = obj2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        R(true);
        f0(false);
        z4.d = 2;
    }

    public final void r() {
        e0();
        Q();
        Z z4 = this.f3081t0;
        z4.a(6);
        this.f3076r.d();
        z4.f3218e = this.f3091z.a();
        z4.c = 0;
        z4.f3220g = false;
        this.f3025A.a0(this.f3072p, z4);
        z4.f3219f = false;
        this.f3074q = null;
        z4.f3223j = z4.f3223j && this.f3057b0 != null;
        z4.d = 4;
        R(true);
        f0(false);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z4) {
        c0 J4 = J(view);
        if (J4 != null) {
            if (J4.k()) {
                J4.f3251j &= -257;
            } else if (!J4.p()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + J4 + z());
            }
        }
        view.clearAnimation();
        o(view);
        super.removeDetachedView(view, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0212y c0212y = this.f3025A.f3186e;
        if ((c0212y == null || !c0212y.f3436e) && !M() && view2 != null) {
            Y(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        return this.f3025A.j0(this, view, rect, z4, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        ArrayList arrayList = this.f3029C;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((InterfaceC0181O) arrayList.get(i4)).c(z4);
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3039H != 0 || this.f3043J) {
            this.f3041I = true;
        } else {
            super.requestLayout();
        }
    }

    public final boolean s(int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i5, i6, iArr, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i4, int i5) {
        AbstractC0178L abstractC0178L = this.f3025A;
        if (abstractC0178L == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f3043J) {
            return;
        }
        boolean d = abstractC0178L.d();
        boolean e4 = this.f3025A.e();
        if (d || e4) {
            if (!d) {
                i4 = 0;
            }
            if (!e4) {
                i5 = 0;
            }
            a0(i4, i5, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i4, int i5) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!M()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f3045L |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(e0 e0Var) {
        this.f3026A0 = e0Var;
        A.h(this, e0Var);
    }

    public void setAdapter(AbstractC0171E abstractC0171E) {
        setLayoutFrozen(false);
        AbstractC0171E abstractC0171E2 = this.f3091z;
        C0187V c0187v = this.f3070o;
        if (abstractC0171E2 != null) {
            abstractC0171E2.f3176a.unregisterObserver(c0187v);
            this.f3091z.getClass();
        }
        AbstractC0175I abstractC0175I = this.f3057b0;
        if (abstractC0175I != null) {
            abstractC0175I.e();
        }
        AbstractC0178L abstractC0178L = this.f3025A;
        C0185T c0185t = this.f3072p;
        if (abstractC0178L != null) {
            abstractC0178L.f0(c0185t);
            this.f3025A.g0(c0185t);
        }
        c0185t.f3203a.clear();
        c0185t.d();
        Tw tw = this.f3076r;
        tw.s((ArrayList) tw.c);
        tw.s((ArrayList) tw.d);
        tw.f7098a = 0;
        AbstractC0171E abstractC0171E3 = this.f3091z;
        this.f3091z = abstractC0171E;
        if (abstractC0171E != null) {
            abstractC0171E.f3176a.registerObserver(c0187v);
        }
        AbstractC0171E abstractC0171E4 = this.f3091z;
        c0185t.f3203a.clear();
        c0185t.d();
        C0184S c = c0185t.c();
        if (abstractC0171E3 != null) {
            c.f3202b--;
        }
        if (c.f3202b == 0) {
            SparseArray sparseArray = c.f3201a;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                ((C0183Q) sparseArray.valueAt(i4)).f3199a.clear();
            }
        }
        if (abstractC0171E4 != null) {
            c.f3202b++;
        }
        this.f3081t0.f3219f = true;
        V(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0173G interfaceC0173G) {
        if (interfaceC0173G == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(interfaceC0173G != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z4) {
        if (z4 != this.f3082u) {
            this.f3056a0 = null;
            this.f3054V = null;
            this.f3055W = null;
            this.f3053U = null;
        }
        this.f3082u = z4;
        super.setClipToPadding(z4);
        if (this.f3037G) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0174H c0174h) {
        c0174h.getClass();
        this.f3052T = c0174h;
        this.f3056a0 = null;
        this.f3054V = null;
        this.f3055W = null;
        this.f3053U = null;
    }

    public void setHasFixedSize(boolean z4) {
        this.f3035F = z4;
    }

    public void setItemAnimator(AbstractC0175I abstractC0175I) {
        AbstractC0175I abstractC0175I2 = this.f3057b0;
        if (abstractC0175I2 != null) {
            abstractC0175I2.e();
            this.f3057b0.f3178a = null;
        }
        this.f3057b0 = abstractC0175I;
        if (abstractC0175I != null) {
            abstractC0175I.f3178a = this.f3090y0;
        }
    }

    public void setItemViewCacheSize(int i4) {
        C0185T c0185t = this.f3072p;
        c0185t.f3205e = i4;
        c0185t.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z4) {
        suppressLayout(z4);
    }

    public void setLayoutManager(AbstractC0178L abstractC0178L) {
        C0212y c0212y;
        if (abstractC0178L == this.f3025A) {
            return;
        }
        setScrollState(0);
        b0 b0Var = this.f3075q0;
        b0Var.f3239u.removeCallbacks(b0Var);
        b0Var.f3235q.abortAnimation();
        AbstractC0178L abstractC0178L2 = this.f3025A;
        if (abstractC0178L2 != null && (c0212y = abstractC0178L2.f3186e) != null) {
            c0212y.g();
        }
        AbstractC0178L abstractC0178L3 = this.f3025A;
        C0185T c0185t = this.f3072p;
        if (abstractC0178L3 != null) {
            AbstractC0175I abstractC0175I = this.f3057b0;
            if (abstractC0175I != null) {
                abstractC0175I.e();
            }
            this.f3025A.f0(c0185t);
            this.f3025A.g0(c0185t);
            c0185t.f3203a.clear();
            c0185t.d();
            if (this.f3033E) {
                AbstractC0178L abstractC0178L4 = this.f3025A;
                abstractC0178L4.f3188g = false;
                abstractC0178L4.Q(this);
            }
            this.f3025A.s0(null);
            this.f3025A = null;
        } else {
            c0185t.f3203a.clear();
            c0185t.d();
        }
        e eVar = this.f3078s;
        RecyclerView recyclerView = ((C0170D) eVar.f14709p).f3175a;
        ((N1.d) eVar.f14710q).n();
        ArrayList arrayList = (ArrayList) eVar.f14711r;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c0 J4 = J((View) arrayList.get(size));
            if (J4 != null) {
                int i4 = J4.f3257p;
                if (recyclerView.M()) {
                    J4.f3258q = i4;
                    recyclerView.f3038G0.add(J4);
                } else {
                    View view = J4.f3244a;
                    WeakHashMap weakHashMap = A.f779a;
                    view.setImportantForAccessibility(i4);
                }
                J4.f3257p = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            recyclerView.o(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f3025A = abstractC0178L;
        if (abstractC0178L != null) {
            if (abstractC0178L.f3185b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0178L + " is already attached to a RecyclerView:" + abstractC0178L.f3185b.z());
            }
            abstractC0178L.s0(this);
            if (this.f3033E) {
                this.f3025A.f3188g = true;
            }
        }
        c0185t.k();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        C0031f scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            ViewGroup viewGroup = scrollingChildHelper.c;
            WeakHashMap weakHashMap = A.f779a;
            AbstractC0044t.m(viewGroup);
        }
        scrollingChildHelper.d = z4;
    }

    public void setOnFlingListener(AbstractC0180N abstractC0180N) {
        this.f3066k0 = abstractC0180N;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0182P abstractC0182P) {
        this.f3083u0 = abstractC0182P;
    }

    public void setPreserveFocusAfterLayout(boolean z4) {
        this.f3073p0 = z4;
    }

    public void setRecycledViewPool(C0184S c0184s) {
        C0185T c0185t = this.f3072p;
        if (c0185t.f3207g != null) {
            r1.f3202b--;
        }
        c0185t.f3207g = c0184s;
        if (c0184s == null || c0185t.f3208h.getAdapter() == null) {
            return;
        }
        c0185t.f3207g.f3202b++;
    }

    public void setRecyclerListener(InterfaceC0186U interfaceC0186U) {
    }

    public void setScrollState(int i4) {
        C0212y c0212y;
        if (i4 == this.f3058c0) {
            return;
        }
        this.f3058c0 = i4;
        if (i4 != 2) {
            b0 b0Var = this.f3075q0;
            b0Var.f3239u.removeCallbacks(b0Var);
            b0Var.f3235q.abortAnimation();
            AbstractC0178L abstractC0178L = this.f3025A;
            if (abstractC0178L != null && (c0212y = abstractC0178L.f3186e) != null) {
                c0212y.g();
            }
        }
        AbstractC0178L abstractC0178L2 = this.f3025A;
        if (abstractC0178L2 != null) {
            abstractC0178L2.e0(i4);
        }
        AbstractC0182P abstractC0182P = this.f3083u0;
        if (abstractC0182P != null) {
            abstractC0182P.a(this, i4);
        }
        ArrayList arrayList = this.f3085v0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0182P) this.f3085v0.get(size)).a(this, i4);
            }
        }
    }

    public void setScrollingTouchSlop(int i4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i4 != 0) {
            if (i4 == 1) {
                this.f3065j0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i4 + "; using default value");
        }
        this.f3065j0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(a0 a0Var) {
        this.f3072p.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i4) {
        return getScrollingChildHelper().g(i4, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z4) {
        C0212y c0212y;
        if (z4 != this.f3043J) {
            i("Do not suppressLayout in layout or scroll");
            if (!z4) {
                this.f3043J = false;
                if (this.f3041I && this.f3025A != null && this.f3091z != null) {
                    requestLayout();
                }
                this.f3041I = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f3043J = true;
            this.f3044K = true;
            setScrollState(0);
            b0 b0Var = this.f3075q0;
            b0Var.f3239u.removeCallbacks(b0Var);
            b0Var.f3235q.abortAnimation();
            AbstractC0178L abstractC0178L = this.f3025A;
            if (abstractC0178L == null || (c0212y = abstractC0178L.f3186e) == null) {
                return;
            }
            c0212y.g();
        }
    }

    public final void t(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        getScrollingChildHelper().d(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    public final void u(int i4, int i5) {
        this.f3051S++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i4, scrollY - i5);
        AbstractC0182P abstractC0182P = this.f3083u0;
        if (abstractC0182P != null) {
            abstractC0182P.b(this, i4, i5);
        }
        ArrayList arrayList = this.f3085v0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0182P) this.f3085v0.get(size)).b(this, i4, i5);
            }
        }
        this.f3051S--;
    }

    public final void v() {
        if (this.f3056a0 != null) {
            return;
        }
        this.f3052T.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f3056a0 = edgeEffect;
        if (this.f3082u) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void w() {
        if (this.f3053U != null) {
            return;
        }
        this.f3052T.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f3053U = edgeEffect;
        if (this.f3082u) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.f3055W != null) {
            return;
        }
        this.f3052T.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f3055W = edgeEffect;
        if (this.f3082u) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void y() {
        if (this.f3054V != null) {
            return;
        }
        this.f3052T.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f3054V = edgeEffect;
        if (this.f3082u) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String z() {
        return " " + super.toString() + ", adapter:" + this.f3091z + ", layout:" + this.f3025A + ", context:" + getContext();
    }
}
