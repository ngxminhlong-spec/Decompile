package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import e.AbstractC1657a;
import k.AbstractC1746c;
import k.C1745b;
import k.InterfaceC1740A;
import k.l;
import k.m;
import k.p;
import l.InterfaceC1775k;
import l.M;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ActionMenuItemView extends M implements InterfaceC1740A, View.OnClickListener, InterfaceC1775k {

    /* renamed from: A, reason: collision with root package name */
    public final int f2451A;

    /* renamed from: B, reason: collision with root package name */
    public int f2452B;

    /* renamed from: C, reason: collision with root package name */
    public final int f2453C;

    /* renamed from: s, reason: collision with root package name */
    public p f2454s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f2455t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f2456u;

    /* renamed from: v, reason: collision with root package name */
    public l f2457v;

    /* renamed from: w, reason: collision with root package name */
    public C1745b f2458w;

    /* renamed from: x, reason: collision with root package name */
    public AbstractC1746c f2459x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2460z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.y = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1657a.c, 0, 0);
        this.f2451A = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f2453C = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2452B = -1;
        setSaveEnabled(false);
    }

    @Override // l.InterfaceC1775k
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // k.InterfaceC1740A
    public final void b(p pVar) {
        this.f2454s = pVar;
        setIcon(pVar.getIcon());
        setTitle(pVar.getTitleCondensed());
        setId(pVar.f13456a);
        setVisibility(pVar.isVisible() ? 0 : 8);
        setEnabled(pVar.isEnabled());
        if (pVar.hasSubMenu() && this.f2458w == null) {
            this.f2458w = new C1745b(this);
        }
    }

    @Override // l.InterfaceC1775k
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f2454s.getIcon() == null;
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (i4 < 480) {
            return (i4 >= 640 && i5 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // k.InterfaceC1740A
    public p getItemData() {
        return this.f2454s;
    }

    public final void h() {
        boolean z4 = true;
        boolean z5 = !TextUtils.isEmpty(this.f2455t);
        if (this.f2456u != null && ((this.f2454s.y & 4) != 4 || (!this.y && !this.f2460z))) {
            z4 = false;
        }
        boolean z6 = z5 & z4;
        setText(z6 ? this.f2455t : null);
        CharSequence charSequence = this.f2454s.f13470q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z6 ? null : this.f2454s.f13458e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f2454s.f13471r;
        if (TextUtils.isEmpty(charSequence2)) {
            a.s(this, z6 ? null : this.f2454s.f13458e);
        } else {
            a.s(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.f2457v;
        if (lVar != null) {
            lVar.a(this.f2454s);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.y = e();
        h();
    }

    @Override // l.M, android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i6 = this.f2452B) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f2451A;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i7) : i7;
        if (mode != 1073741824 && i7 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i5);
        }
        if (!isEmpty || this.f2456u == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f2456u.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1745b c1745b;
        if (this.f2454s.hasSubMenu() && (c1745b = this.f2458w) != null && c1745b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z4) {
    }

    public void setChecked(boolean z4) {
    }

    public void setExpandedFormat(boolean z4) {
        if (this.f2460z != z4) {
            this.f2460z = z4;
            p pVar = this.f2454s;
            if (pVar != null) {
                m mVar = pVar.f13467n;
                mVar.f13434k = true;
                mVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2456u = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i4 = this.f2453C;
            if (intrinsicWidth > i4) {
                intrinsicHeight = (int) (intrinsicHeight * (i4 / intrinsicWidth));
                intrinsicWidth = i4;
            }
            if (intrinsicHeight > i4) {
                intrinsicWidth = (int) (intrinsicWidth * (i4 / intrinsicHeight));
            } else {
                i4 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i4);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(l lVar) {
        this.f2457v = lVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i4, int i5, int i6, int i7) {
        this.f2452B = i4;
        super.setPadding(i4, i5, i6, i7);
    }

    public void setPopupCallback(AbstractC1746c abstractC1746c) {
        this.f2459x = abstractC1746c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2455t = charSequence;
        h();
    }
}
