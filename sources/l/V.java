package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class V extends ListView {

    /* renamed from: A, reason: collision with root package name */
    public g2.x f13677A;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f13678o;

    /* renamed from: p, reason: collision with root package name */
    public int f13679p;

    /* renamed from: q, reason: collision with root package name */
    public int f13680q;

    /* renamed from: r, reason: collision with root package name */
    public int f13681r;

    /* renamed from: s, reason: collision with root package name */
    public int f13682s;

    /* renamed from: t, reason: collision with root package name */
    public int f13683t;

    /* renamed from: u, reason: collision with root package name */
    public final Field f13684u;

    /* renamed from: v, reason: collision with root package name */
    public U f13685v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f13686w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f13687x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public J.e f13688z;

    public V(Context context, boolean z4) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f13678o = new Rect();
        this.f13679p = 0;
        this.f13680q = 0;
        this.f13681r = 0;
        this.f13682s = 0;
        this.f13687x = z4;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f13684u = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e4) {
            e4.printStackTrace();
        }
    }

    public final int a(int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = 0;
        View view = null;
        for (int i8 = 0; i8 < count; i8++) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i4, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i5) {
                return i5;
            }
        }
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r18, int r19) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.V.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f13678o;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f13677A != null) {
            return;
        }
        super.drawableStateChanged();
        U u2 = this.f13685v;
        if (u2 != null) {
            u2.f13676p = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.y && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f13687x || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f13687x || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f13687x || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f13687x && this.f13686w) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f13677A = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f13677A == null) {
            g2.x xVar = new g2.x(2, this);
            this.f13677A = xVar;
            post(xVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
            }
            Drawable selector = getSelector();
            if (selector != null && this.y && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f13683t = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        g2.x xVar = this.f13677A;
        if (xVar != null) {
            V v4 = (V) xVar.f13040p;
            v4.f13677A = null;
            v4.removeCallbacks(xVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z4) {
        this.f13686w = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.U, android.graphics.drawable.Drawable$Callback, android.graphics.drawable.Drawable] */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        U u2 = null;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f13675o;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.f13675o = drawable;
            drawable.setCallback(drawable2);
            drawable2.f13676p = true;
            u2 = drawable2;
        }
        this.f13685v = u2;
        super.setSelector(u2);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.f13679p = rect.left;
        this.f13680q = rect.top;
        this.f13681r = rect.right;
        this.f13682s = rect.bottom;
    }
}
