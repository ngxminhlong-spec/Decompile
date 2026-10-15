package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class I0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: x, reason: collision with root package name */
    public static I0 f13627x;
    public static I0 y;

    /* renamed from: o, reason: collision with root package name */
    public final View f13628o;

    /* renamed from: p, reason: collision with root package name */
    public final CharSequence f13629p;

    /* renamed from: q, reason: collision with root package name */
    public final int f13630q;

    /* renamed from: r, reason: collision with root package name */
    public final H0 f13631r = new H0(this, 0);

    /* renamed from: s, reason: collision with root package name */
    public final H0 f13632s = new H0(this, 1);

    /* renamed from: t, reason: collision with root package name */
    public int f13633t;

    /* renamed from: u, reason: collision with root package name */
    public int f13634u;

    /* renamed from: v, reason: collision with root package name */
    public J0 f13635v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13636w;

    public I0(View view, CharSequence charSequence) {
        this.f13628o = view;
        this.f13629p = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = H.B.f781a;
        this.f13630q = Build.VERSION.SDK_INT >= 28 ? B.b.j(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f13633t = Integer.MAX_VALUE;
        this.f13634u = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(I0 i02) {
        I0 i03 = f13627x;
        if (i03 != null) {
            i03.f13628o.removeCallbacks(i03.f13631r);
        }
        f13627x = i02;
        if (i02 != null) {
            i02.f13628o.postDelayed(i02.f13631r, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        I0 i02 = y;
        View view = this.f13628o;
        if (i02 == this) {
            y = null;
            J0 j02 = this.f13635v;
            if (j02 != null) {
                View view2 = (View) j02.f13638p;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) j02.f13637o).getSystemService("window")).removeView(view2);
                }
                this.f13635v = null;
                this.f13633t = Integer.MAX_VALUE;
                this.f13634u = Integer.MAX_VALUE;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f13627x == this) {
            b(null);
        }
        view.removeCallbacks(this.f13632s);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [l.J0, java.lang.Object] */
    public final void c(boolean z4) {
        int height;
        int i4;
        int i5;
        boolean z5;
        int i6;
        int i7;
        long longPressTimeout;
        long j4;
        long j5;
        WeakHashMap weakHashMap = H.A.f779a;
        View view = this.f13628o;
        if (view.isAttachedToWindow()) {
            b(null);
            I0 i02 = y;
            if (i02 != null) {
                i02.a();
            }
            y = this;
            this.f13636w = z4;
            Context context = view.getContext();
            ?? obj = new Object();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            obj.f13640r = layoutParams;
            obj.f13641s = new Rect();
            obj.f13642t = new int[2];
            obj.f13643u = new int[2];
            obj.f13637o = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            obj.f13638p = inflate;
            obj.f13639q = (TextView) inflate.findViewById(R.id.message);
            layoutParams.setTitle(J0.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) obj.f13638p;
            Context context2 = (Context) obj.f13637o;
            this.f13635v = obj;
            int i8 = this.f13633t;
            int i9 = this.f13634u;
            boolean z6 = this.f13636w;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.f13640r;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) obj.f13639q).setText(this.f13629p);
            int[] iArr = (int[]) obj.f13643u;
            int[] iArr2 = (int[]) obj.f13642t;
            Rect rect = (Rect) obj.f13641s;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i8 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i9 + dimensionPixelOffset2;
                i4 = i9 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i4 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z6 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i10 = i8;
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                Context context3 = view.getContext();
                while (true) {
                    if (!(context3 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i7 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i5 = i4;
                    z5 = z6;
                    i6 = 0;
                    i7 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i7 = 1;
                    i5 = i4;
                    z5 = z6;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i6 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i11 = iArr2[i6] - iArr[i6];
                iArr2[i6] = i11;
                iArr2[i7] = iArr2[i7] - iArr[i7];
                layoutParams2.x = (i11 + i10) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, i6);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i12 = iArr2[i7];
                int i13 = ((i12 + i5) - dimensionPixelOffset3) - measuredHeight;
                int i14 = i12 + height + dimensionPixelOffset3;
                if (z5) {
                    if (i13 >= 0) {
                        layoutParams2.y = i13;
                    } else {
                        layoutParams2.y = i14;
                    }
                } else if (measuredHeight + i14 <= rect.height()) {
                    layoutParams2.y = i14;
                } else {
                    layoutParams2.y = i13;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f13636w) {
                j5 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == i7) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j4 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j4 = 15000;
                }
                j5 = j4 - longPressTimeout;
            }
            H0 h02 = this.f13632s;
            view.removeCallbacks(h02);
            view.postDelayed(h02, j5);
        }
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f13635v == null || !this.f13636w) {
            View view2 = this.f13628o;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f13633t = Integer.MAX_VALUE;
                        this.f13634u = Integer.MAX_VALUE;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f13635v == null) {
                    int x4 = (int) motionEvent.getX();
                    int y4 = (int) motionEvent.getY();
                    int abs = Math.abs(x4 - this.f13633t);
                    int i4 = this.f13630q;
                    if (abs > i4 || Math.abs(y4 - this.f13634u) > i4) {
                        this.f13633t = x4;
                        this.f13634u = y4;
                        b(this);
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f13633t = view.getWidth() / 2;
        this.f13634u = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
