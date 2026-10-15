package com.google.android.material.chip;

import B0.q;
import F.g;
import H.A;
import H.AbstractC0044t;
import J2.a;
import J2.b;
import J2.c;
import J2.d;
import J2.e;
import P2.w;
import V2.k;
import V2.u;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import d3.AbstractC1654b;
import g.AbstractC1678a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import l.C1783p;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class Chip extends C1783p implements d, u {

    /* renamed from: H, reason: collision with root package name */
    public static final Rect f12333H = new Rect();

    /* renamed from: I, reason: collision with root package name */
    public static final int[] f12334I = {R.attr.state_selected};

    /* renamed from: J, reason: collision with root package name */
    public static final int[] f12335J = {R.attr.state_checkable};

    /* renamed from: A, reason: collision with root package name */
    public boolean f12336A;

    /* renamed from: B, reason: collision with root package name */
    public int f12337B;

    /* renamed from: C, reason: collision with root package name */
    public int f12338C;

    /* renamed from: D, reason: collision with root package name */
    public final c f12339D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f12340E;

    /* renamed from: F, reason: collision with root package name */
    public final RectF f12341F;

    /* renamed from: G, reason: collision with root package name */
    public final a f12342G;

    /* renamed from: r, reason: collision with root package name */
    public e f12343r;

    /* renamed from: s, reason: collision with root package name */
    public InsetDrawable f12344s;

    /* renamed from: t, reason: collision with root package name */
    public RippleDrawable f12345t;

    /* renamed from: u, reason: collision with root package name */
    public View.OnClickListener f12346u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f12347v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f12348w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f12349x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f12350z;

    public Chip(Context context, AttributeSet attributeSet) {
        super(Z2.a.a(context, attributeSet, com.duracodefactory.logiccircuitsimulatorpro.R.attr.chipStyle, com.duracodefactory.logiccircuitsimulatorpro.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.duracodefactory.logiccircuitsimulatorpro.R.attr.chipStyle);
        int resourceId;
        this.f12340E = new Rect();
        this.f12341F = new RectF();
        this.f12342G = new a(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        e eVar = new e(context2, attributeSet);
        Context context3 = eVar.f1015s0;
        int[] iArr = B2.a.f138b;
        TypedArray d = w.d(context3, attributeSet, iArr, com.duracodefactory.logiccircuitsimulatorpro.R.attr.chipStyle, com.duracodefactory.logiccircuitsimulatorpro.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        eVar.f989S0 = d.hasValue(36);
        Context context4 = eVar.f1015s0;
        ColorStateList u2 = AbstractC1654b.u(context4, d, 23);
        if (eVar.f976L != u2) {
            eVar.f976L = u2;
            eVar.onStateChange(eVar.getState());
        }
        ColorStateList u4 = AbstractC1654b.u(context4, d, 10);
        if (eVar.f978M != u4) {
            eVar.f978M = u4;
            eVar.onStateChange(eVar.getState());
        }
        float dimension = d.getDimension(18, 0.0f);
        if (eVar.N != dimension) {
            eVar.N = dimension;
            eVar.invalidateSelf();
            eVar.t();
        }
        if (d.hasValue(11)) {
            eVar.z(d.getDimension(11, 0.0f));
        }
        eVar.E(AbstractC1654b.u(context4, d, 21));
        eVar.F(d.getDimension(22, 0.0f));
        eVar.O(AbstractC1654b.u(context4, d, 35));
        String text = d.getText(4);
        text = text == null ? "" : text;
        if (!TextUtils.equals(eVar.f988S, text)) {
            eVar.f988S = text;
            eVar.f1021y0.d = true;
            eVar.invalidateSelf();
            eVar.t();
        }
        eVar.P((!d.hasValue(0) || (resourceId = d.getResourceId(0, 0)) == 0) ? null : new S2.d(context4, resourceId));
        int i4 = d.getInt(2, 0);
        if (i4 == 1) {
            eVar.f983P0 = TextUtils.TruncateAt.START;
        } else if (i4 == 2) {
            eVar.f983P0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i4 == 3) {
            eVar.f983P0 = TextUtils.TruncateAt.END;
        }
        eVar.D(d.getBoolean(17, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            eVar.D(d.getBoolean(14, false));
        }
        eVar.A(AbstractC1654b.w(context4, d, 13));
        if (d.hasValue(16)) {
            eVar.C(AbstractC1654b.u(context4, d, 16));
        }
        eVar.B(d.getDimension(15, 0.0f));
        eVar.L(d.getBoolean(30, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            eVar.L(d.getBoolean(25, false));
        }
        eVar.G(AbstractC1654b.w(context4, d, 24));
        eVar.K(AbstractC1654b.u(context4, d, 29));
        eVar.I(d.getDimension(27, 0.0f));
        eVar.v(d.getBoolean(5, false));
        eVar.y(d.getBoolean(9, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            eVar.y(d.getBoolean(7, false));
        }
        eVar.w(AbstractC1654b.w(context4, d, 6));
        if (d.hasValue(8)) {
            eVar.x(AbstractC1654b.u(context4, d, 8));
        }
        eVar.f1005i0 = C2.d.a(context4, d, 38);
        eVar.f1006j0 = C2.d.a(context4, d, 32);
        float dimension2 = d.getDimension(20, 0.0f);
        if (eVar.f1007k0 != dimension2) {
            eVar.f1007k0 = dimension2;
            eVar.invalidateSelf();
            eVar.t();
        }
        eVar.N(d.getDimension(34, 0.0f));
        eVar.M(d.getDimension(33, 0.0f));
        float dimension3 = d.getDimension(40, 0.0f);
        if (eVar.f1010n0 != dimension3) {
            eVar.f1010n0 = dimension3;
            eVar.invalidateSelf();
            eVar.t();
        }
        float dimension4 = d.getDimension(39, 0.0f);
        if (eVar.f1011o0 != dimension4) {
            eVar.f1011o0 = dimension4;
            eVar.invalidateSelf();
            eVar.t();
        }
        eVar.J(d.getDimension(28, 0.0f));
        eVar.H(d.getDimension(26, 0.0f));
        float dimension5 = d.getDimension(12, 0.0f);
        if (eVar.f1014r0 != dimension5) {
            eVar.f1014r0 = dimension5;
            eVar.invalidateSelf();
            eVar.t();
        }
        eVar.f987R0 = d.getDimensionPixelSize(3, Integer.MAX_VALUE);
        d.recycle();
        w.a(context2, attributeSet, com.duracodefactory.logiccircuitsimulatorpro.R.attr.chipStyle, com.duracodefactory.logiccircuitsimulatorpro.R.style.Widget_MaterialComponents_Chip_Action);
        w.b(context2, attributeSet, iArr, com.duracodefactory.logiccircuitsimulatorpro.R.attr.chipStyle, com.duracodefactory.logiccircuitsimulatorpro.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.duracodefactory.logiccircuitsimulatorpro.R.attr.chipStyle, com.duracodefactory.logiccircuitsimulatorpro.R.style.Widget_MaterialComponents_Chip_Action);
        this.f12336A = obtainStyledAttributes.getBoolean(31, false);
        this.f12338C = (int) Math.ceil(obtainStyledAttributes.getDimension(19, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(eVar);
        WeakHashMap weakHashMap = A.f779a;
        eVar.h(AbstractC0044t.d(this));
        w.a(context2, attributeSet, com.duracodefactory.logiccircuitsimulatorpro.R.attr.chipStyle, com.duracodefactory.logiccircuitsimulatorpro.R.style.Widget_MaterialComponents_Chip_Action);
        w.b(context2, attributeSet, iArr, com.duracodefactory.logiccircuitsimulatorpro.R.attr.chipStyle, com.duracodefactory.logiccircuitsimulatorpro.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.duracodefactory.logiccircuitsimulatorpro.R.attr.chipStyle, com.duracodefactory.logiccircuitsimulatorpro.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(36);
        obtainStyledAttributes2.recycle();
        this.f12339D = new c(this, this);
        e();
        if (!hasValue) {
            setOutlineProvider(new b(this));
        }
        setChecked(this.f12348w);
        setText(eVar.f988S);
        setEllipsize(eVar.f983P0);
        h();
        if (!this.f12343r.f985Q0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f12336A) {
            setMinHeight(this.f12338C);
        }
        this.f12337B = getLayoutDirection();
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f12341F;
        rectF.setEmpty();
        if (c()) {
            e eVar = this.f12343r;
            Rect bounds = eVar.getBounds();
            rectF.setEmpty();
            if (eVar.S()) {
                float f4 = eVar.f1014r0 + eVar.f1013q0 + eVar.f999c0 + eVar.f1012p0 + eVar.f1011o0;
                if (eVar.getLayoutDirection() == 0) {
                    float f5 = bounds.right;
                    rectF.right = f5;
                    rectF.left = f5 - f4;
                } else {
                    float f6 = bounds.left;
                    rectF.left = f6;
                    rectF.right = f6 + f4;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i4 = (int) closeIconTouchBounds.left;
        int i5 = (int) closeIconTouchBounds.top;
        int i6 = (int) closeIconTouchBounds.right;
        int i7 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f12340E;
        rect.set(i4, i5, i6, i7);
        return rect;
    }

    private S2.d getTextAppearance() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f1021y0.f1608f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z4) {
        if (this.y != z4) {
            this.y = z4;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z4) {
        if (this.f12349x != z4) {
            this.f12349x = z4;
            refreshDrawableState();
        }
    }

    public final void b(int i4) {
        this.f12338C = i4;
        if (!this.f12336A) {
            InsetDrawable insetDrawable = this.f12344s;
            if (insetDrawable == null) {
                int[] iArr = T2.a.f1803a;
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f12344s = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = T2.a.f1803a;
                    f();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i4 - ((int) this.f12343r.N));
        int max2 = Math.max(0, i4 - this.f12343r.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f12344s;
            if (insetDrawable2 == null) {
                int[] iArr3 = T2.a.f1803a;
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f12344s = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = T2.a.f1803a;
                    f();
                    return;
                }
                return;
            }
        }
        int i5 = max2 > 0 ? max2 / 2 : 0;
        int i6 = max > 0 ? max / 2 : 0;
        if (this.f12344s != null) {
            Rect rect = new Rect();
            this.f12344s.getPadding(rect);
            if (rect.top == i6 && rect.bottom == i6 && rect.left == i5 && rect.right == i5) {
                int[] iArr5 = T2.a.f1803a;
                f();
                return;
            }
        }
        if (getMinHeight() != i4) {
            setMinHeight(i4);
        }
        if (getMinWidth() != i4) {
            setMinWidth(i4);
        }
        this.f12344s = new InsetDrawable((Drawable) this.f12343r, i5, i6, i5, i6);
        int[] iArr6 = T2.a.f1803a;
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r2 = this;
            J2.e r0 = r2.f12343r
            if (r0 == 0) goto L13
            android.graphics.drawable.Drawable r0 = r0.f996Z
            if (r0 == 0) goto Le
            boolean r1 = r0 instanceof B.d
            if (r1 == 0) goto Lf
            B.d r0 = (B.d) r0
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L13
            r0 = 1
            return r0
        L13:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.c():boolean");
    }

    public final boolean d() {
        e eVar = this.f12343r;
        return eVar != null && eVar.f1001e0;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        Field declaredField;
        int action = motionEvent.getAction();
        int i4 = 0;
        c cVar = this.f12339D;
        if (action == 10) {
            try {
                declaredField = M.b.class.getDeclaredField("m");
                declaredField.setAccessible(true);
            } catch (IllegalAccessException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            } catch (NoSuchFieldException e5) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e5);
            } catch (NoSuchMethodException e6) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e6);
            } catch (InvocationTargetException e7) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e7);
            }
            if (((Integer) declaredField.get(cVar)).intValue() != Integer.MIN_VALUE) {
                Method declaredMethod = M.b.class.getDeclaredMethod("r", Integer.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(cVar, Integer.MIN_VALUE);
                return true;
            }
        }
        AccessibilityManager accessibilityManager = cVar.f1109h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action2 = motionEvent.getAction();
            if (action2 == 7 || action2 == 9) {
                float x4 = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = cVar.f963q;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x4, y)) {
                    i4 = 1;
                }
                cVar.r(i4);
            } else if (action2 == 10 && cVar.f1114m != Integer.MIN_VALUE) {
                cVar.r(Integer.MIN_VALUE);
            }
            return true;
        }
        if (!super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        c cVar = this.f12339D;
        cVar.getClass();
        boolean z4 = false;
        int i4 = 0;
        z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i5 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i5 = 33;
                                } else if (keyCode == 21) {
                                    i5 = 17;
                                } else if (keyCode != 22) {
                                    i5 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z5 = false;
                                while (i4 < repeatCount && cVar.m(i5, null)) {
                                    i4++;
                                    z5 = true;
                                }
                                z4 = z5;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i6 = cVar.f1113l;
                    if (i6 != Integer.MIN_VALUE) {
                        Chip chip = cVar.f963q;
                        if (i6 == 0) {
                            chip.performClick();
                        } else if (i6 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f12346u;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            chip.f12339D.q(1, 1);
                        }
                    }
                    z4 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z4 = cVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z4 = cVar.m(1, null);
            }
        }
        if (!z4 || cVar.f1113l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // l.C1783p, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i4;
        super.drawableStateChanged();
        e eVar = this.f12343r;
        boolean z4 = false;
        if (eVar != null && e.s(eVar.f996Z)) {
            e eVar2 = this.f12343r;
            ?? isEnabled = isEnabled();
            int i5 = isEnabled;
            if (this.f12350z) {
                i5 = isEnabled + 1;
            }
            int i6 = i5;
            if (this.y) {
                i6 = i5 + 1;
            }
            int i7 = i6;
            if (this.f12349x) {
                i7 = i6 + 1;
            }
            int i8 = i7;
            if (isChecked()) {
                i8 = i7 + 1;
            }
            int[] iArr = new int[i8];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (this.f12350z) {
                iArr[i4] = 16842908;
                i4++;
            }
            if (this.y) {
                iArr[i4] = 16843623;
                i4++;
            }
            if (this.f12349x) {
                iArr[i4] = 16842919;
                i4++;
            }
            if (isChecked()) {
                iArr[i4] = 16842913;
            }
            if (!Arrays.equals(eVar2.f979M0, iArr)) {
                eVar2.f979M0 = iArr;
                if (eVar2.S()) {
                    z4 = eVar2.u(eVar2.getState(), iArr);
                }
            }
        }
        if (z4) {
            invalidate();
        }
    }

    public final void e() {
        e eVar;
        if (!c() || (eVar = this.f12343r) == null || !eVar.f995Y || this.f12346u == null) {
            A.h(this, null);
        } else {
            A.h(this, this.f12339D);
        }
    }

    public final void f() {
        this.f12345t = new RippleDrawable(T2.a.a(this.f12343r.f986R), getBackgroundDrawable(), null);
        this.f12343r.getClass();
        RippleDrawable rippleDrawable = this.f12345t;
        WeakHashMap weakHashMap = A.f779a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        e eVar;
        if (TextUtils.isEmpty(getText()) || (eVar = this.f12343r) == null) {
            return;
        }
        int p3 = (int) (eVar.p() + eVar.f1014r0 + eVar.f1011o0);
        e eVar2 = this.f12343r;
        int o4 = (int) (eVar2.o() + eVar2.f1007k0 + eVar2.f1010n0);
        if (this.f12344s != null) {
            Rect rect = new Rect();
            this.f12344s.getPadding(rect);
            o4 += rect.left;
            p3 += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = A.f779a;
        setPaddingRelative(o4, paddingTop, p3, paddingBottom);
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f12344s;
        return insetDrawable == null ? this.f12343r : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f1003g0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f1004h0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f978M;
        }
        return null;
    }

    public float getChipCornerRadius() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return Math.max(0.0f, eVar.q());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f12343r;
    }

    public float getChipEndPadding() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f1014r0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        e eVar = this.f12343r;
        if (eVar == null || (drawable = eVar.f991U) == 0) {
            return null;
        }
        if (!(drawable instanceof B.d)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f993W;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f992V;
        }
        return null;
    }

    public float getChipMinHeight() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.N;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f1007k0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f982P;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f984Q;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        e eVar = this.f12343r;
        if (eVar == null || (drawable = eVar.f996Z) == 0) {
            return null;
        }
        if (!(drawable instanceof B.d)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f1000d0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f1013q0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f999c0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f1012p0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f998b0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f983P0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        c cVar = this.f12339D;
        if (cVar.f1113l == 1 || cVar.f1112k == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C2.d getHideMotionSpec() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f1006j0;
        }
        return null;
    }

    public float getIconEndPadding() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f1009m0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f1008l0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f986R;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f12343r.f1880o.f1854a;
    }

    public C2.d getShowMotionSpec() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f1005i0;
        }
        return null;
    }

    public float getTextEndPadding() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f1011o0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        e eVar = this.f12343r;
        if (eVar != null) {
            return eVar.f1010n0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        e eVar = this.f12343r;
        if (eVar != null) {
            paint.drawableState = eVar.getState();
        }
        S2.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.c(getContext(), paint, this.f12342G);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC1654b.P(this, this.f12343r);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f12334I);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f12335J);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z4, int i4, Rect rect) {
        super.onFocusChanged(z4, i4, rect);
        c cVar = this.f12339D;
        int i5 = cVar.f1113l;
        if (i5 != Integer.MIN_VALUE) {
            cVar.j(i5);
        }
        if (z4) {
            cVar.m(i4, rect);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i4;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (d() || isClickable()) {
            accessibilityNodeInfo.setClassName(d() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f1565q) {
                i4 = 0;
                for (int i5 = 0; i5 < chipGroup.getChildCount(); i5++) {
                    if (chipGroup.getChildAt(i5) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i5)) == this) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
            i4 = -1;
            Object tag = getTag(com.duracodefactory.logiccircuitsimulatorpro.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) D3.d.u(isChecked(), tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i4, 1).f677p);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i4) {
        PointerIcon systemIcon;
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
        return systemIcon;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        if (this.f12337B != i4) {
            this.f12337B = i4;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L25;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L46
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L41
            goto L4c
        L21:
            boolean r0 = r5.f12349x
            if (r0 == 0) goto L4c
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L4d
        L2c:
            boolean r0 = r5.f12349x
            if (r0 == 0) goto L41
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f12346u
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            J2.c r0 = r5.f12339D
            r0.q(r2, r2)
            r0 = r2
            goto L42
        L41:
            r0 = r3
        L42:
            r5.setCloseIconPressed(r3)
            goto L4d
        L46:
            if (r1 == 0) goto L4c
            r5.setCloseIconPressed(r2)
            goto L2a
        L4c:
            r0 = r3
        L4d:
            if (r0 != 0) goto L57
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L56
            goto L57
        L56:
            return r3
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f12345t) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // l.C1783p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f12345t) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // l.C1783p, android.view.View
    public void setBackgroundResource(int i4) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.v(z4);
        }
    }

    public void setCheckableResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.v(eVar.f1015s0.getResources().getBoolean(i4));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        e eVar = this.f12343r;
        if (eVar == null) {
            this.f12348w = z4;
            return;
        }
        if (eVar.f1001e0) {
            boolean isChecked = isChecked();
            super.setChecked(z4);
            if (isChecked == z4 || (onCheckedChangeListener = this.f12347v) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z4);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.w(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z4) {
        setCheckedIconVisible(z4);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i4) {
        setCheckedIconVisible(i4);
    }

    public void setCheckedIconResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.w(AbstractC1678a.a(eVar.f1015s0, i4));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.x(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            Context context = eVar.f1015s0;
            Object obj = AbstractC1678a.f12977a;
            eVar.x(context.getColorStateList(i4));
        }
    }

    public void setCheckedIconVisible(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.y(eVar.f1015s0.getResources().getBoolean(i4));
        }
    }

    public void setCheckedIconVisible(boolean z4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.y(z4);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        e eVar = this.f12343r;
        if (eVar == null || eVar.f978M == colorStateList) {
            return;
        }
        eVar.f978M = colorStateList;
        eVar.onStateChange(eVar.getState());
    }

    public void setChipBackgroundColorResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            Context context = eVar.f1015s0;
            Object obj = AbstractC1678a.f12977a;
            ColorStateList colorStateList = context.getColorStateList(i4);
            if (eVar.f978M != colorStateList) {
                eVar.f978M = colorStateList;
                eVar.onStateChange(eVar.getState());
            }
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.z(f4);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.z(eVar.f1015s0.getResources().getDimension(i4));
        }
    }

    public void setChipDrawable(e eVar) {
        e eVar2 = this.f12343r;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                eVar2.f981O0 = new WeakReference(null);
            }
            this.f12343r = eVar;
            eVar.f985Q0 = false;
            eVar.f981O0 = new WeakReference(this);
            b(this.f12338C);
        }
    }

    public void setChipEndPadding(float f4) {
        e eVar = this.f12343r;
        if (eVar == null || eVar.f1014r0 == f4) {
            return;
        }
        eVar.f1014r0 = f4;
        eVar.invalidateSelf();
        eVar.t();
    }

    public void setChipEndPaddingResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            float dimension = eVar.f1015s0.getResources().getDimension(i4);
            if (eVar.f1014r0 != dimension) {
                eVar.f1014r0 = dimension;
                eVar.invalidateSelf();
                eVar.t();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.A(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z4) {
        setChipIconVisible(z4);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i4) {
        setChipIconVisible(i4);
    }

    public void setChipIconResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.A(AbstractC1678a.a(eVar.f1015s0, i4));
        }
    }

    public void setChipIconSize(float f4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.B(f4);
        }
    }

    public void setChipIconSizeResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.B(eVar.f1015s0.getResources().getDimension(i4));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.C(colorStateList);
        }
    }

    public void setChipIconTintResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            Context context = eVar.f1015s0;
            Object obj = AbstractC1678a.f12977a;
            eVar.C(context.getColorStateList(i4));
        }
    }

    public void setChipIconVisible(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.D(eVar.f1015s0.getResources().getBoolean(i4));
        }
    }

    public void setChipIconVisible(boolean z4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.D(z4);
        }
    }

    public void setChipMinHeight(float f4) {
        e eVar = this.f12343r;
        if (eVar == null || eVar.N == f4) {
            return;
        }
        eVar.N = f4;
        eVar.invalidateSelf();
        eVar.t();
    }

    public void setChipMinHeightResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            float dimension = eVar.f1015s0.getResources().getDimension(i4);
            if (eVar.N != dimension) {
                eVar.N = dimension;
                eVar.invalidateSelf();
                eVar.t();
            }
        }
    }

    public void setChipStartPadding(float f4) {
        e eVar = this.f12343r;
        if (eVar == null || eVar.f1007k0 == f4) {
            return;
        }
        eVar.f1007k0 = f4;
        eVar.invalidateSelf();
        eVar.t();
    }

    public void setChipStartPaddingResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            float dimension = eVar.f1015s0.getResources().getDimension(i4);
            if (eVar.f1007k0 != dimension) {
                eVar.f1007k0 = dimension;
                eVar.invalidateSelf();
                eVar.t();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.E(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            Context context = eVar.f1015s0;
            Object obj = AbstractC1678a.f12977a;
            eVar.E(context.getColorStateList(i4));
        }
    }

    public void setChipStrokeWidth(float f4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.F(f4);
        }
    }

    public void setChipStrokeWidthResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.F(eVar.f1015s0.getResources().getDimension(i4));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i4) {
        setText(getResources().getString(i4));
    }

    public void setCloseIcon(Drawable drawable) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.G(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        e eVar = this.f12343r;
        if (eVar == null || eVar.f1000d0 == charSequence) {
            return;
        }
        String str = F.b.f731b;
        F.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? F.b.f732e : F.b.d;
        bVar.getClass();
        q qVar = g.f737a;
        eVar.f1000d0 = bVar.c(charSequence);
        eVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z4) {
        setCloseIconVisible(z4);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i4) {
        setCloseIconVisible(i4);
    }

    public void setCloseIconEndPadding(float f4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.H(f4);
        }
    }

    public void setCloseIconEndPaddingResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.H(eVar.f1015s0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.G(AbstractC1678a.a(eVar.f1015s0, i4));
        }
        e();
    }

    public void setCloseIconSize(float f4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.I(f4);
        }
    }

    public void setCloseIconSizeResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.I(eVar.f1015s0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconStartPadding(float f4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.J(f4);
        }
    }

    public void setCloseIconStartPaddingResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.J(eVar.f1015s0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.K(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            Context context = eVar.f1015s0;
            Object obj = AbstractC1678a.f12977a;
            eVar.K(context.getColorStateList(i4));
        }
    }

    public void setCloseIconVisible(int i4) {
        setCloseIconVisible(getResources().getBoolean(i4));
    }

    public void setCloseIconVisible(boolean z4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.L(z4);
        }
        e();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i4, i5, i6, i7);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i4, i5, i6, i7);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.h(f4);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f12343r == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.f983P0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z4) {
        this.f12336A = z4;
        b(this.f12338C);
    }

    @Override // android.widget.TextView
    public void setGravity(int i4) {
        if (i4 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i4);
        }
    }

    public void setHideMotionSpec(C2.d dVar) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.f1006j0 = dVar;
        }
    }

    public void setHideMotionSpecResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.f1006j0 = C2.d.b(eVar.f1015s0, i4);
        }
    }

    public void setIconEndPadding(float f4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.M(f4);
        }
    }

    public void setIconEndPaddingResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.M(eVar.f1015s0.getResources().getDimension(i4));
        }
    }

    public void setIconStartPadding(float f4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.N(f4);
        }
    }

    public void setIconStartPaddingResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.N(eVar.f1015s0.getResources().getDimension(i4));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i4) {
        if (this.f12343r == null) {
            return;
        }
        super.setLayoutDirection(i4);
    }

    @Override // android.widget.TextView
    public void setLines(int i4) {
        if (i4 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i4);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i4) {
        if (i4 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i4);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i4) {
        super.setMaxWidth(i4);
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.f987R0 = i4;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i4) {
        if (i4 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i4);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f12347v = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f12346u = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.O(colorStateList);
        }
        this.f12343r.getClass();
        f();
    }

    public void setRippleColorResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            Context context = eVar.f1015s0;
            Object obj = AbstractC1678a.f12977a;
            eVar.O(context.getColorStateList(i4));
            this.f12343r.getClass();
            f();
        }
    }

    @Override // V2.u
    public void setShapeAppearanceModel(k kVar) {
        this.f12343r.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C2.d dVar) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.f1005i0 = dVar;
        }
    }

    public void setShowMotionSpecResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.f1005i0 = C2.d.b(eVar.f1015s0, i4);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z4) {
        if (!z4) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z4);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        e eVar = this.f12343r;
        if (eVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(eVar.f985Q0 ? null : charSequence, bufferType);
        e eVar2 = this.f12343r;
        if (eVar2 == null || TextUtils.equals(eVar2.f988S, charSequence)) {
            return;
        }
        eVar2.f988S = charSequence;
        eVar2.f1021y0.d = true;
        eVar2.invalidateSelf();
        eVar2.t();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i4) {
        super.setTextAppearance(i4);
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.P(new S2.d(eVar.f1015s0, i4));
        }
        h();
    }

    public void setTextAppearance(S2.d dVar) {
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.P(dVar);
        }
        h();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        e eVar = this.f12343r;
        if (eVar != null) {
            eVar.P(new S2.d(eVar.f1015s0, i4));
        }
        h();
    }

    public void setTextAppearanceResource(int i4) {
        setTextAppearance(getContext(), i4);
    }

    public void setTextEndPadding(float f4) {
        e eVar = this.f12343r;
        if (eVar == null || eVar.f1011o0 == f4) {
            return;
        }
        eVar.f1011o0 = f4;
        eVar.invalidateSelf();
        eVar.t();
    }

    public void setTextEndPaddingResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            float dimension = eVar.f1015s0.getResources().getDimension(i4);
            if (eVar.f1011o0 != dimension) {
                eVar.f1011o0 = dimension;
                eVar.invalidateSelf();
                eVar.t();
            }
        }
    }

    public void setTextStartPadding(float f4) {
        e eVar = this.f12343r;
        if (eVar == null || eVar.f1010n0 == f4) {
            return;
        }
        eVar.f1010n0 = f4;
        eVar.invalidateSelf();
        eVar.t();
    }

    public void setTextStartPaddingResource(int i4) {
        e eVar = this.f12343r;
        if (eVar != null) {
            float dimension = eVar.f1015s0.getResources().getDimension(i4);
            if (eVar.f1010n0 != dimension) {
                eVar.f1010n0 = dimension;
                eVar.invalidateSelf();
                eVar.t();
            }
        }
    }
}
