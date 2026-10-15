package com.google.android.material.internal;

import H.A;
import O.b;
import P2.a;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import l.C1786t;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class CheckableImageButton extends C1786t implements Checkable {

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f12436t = {R.attr.state_checked};

    /* renamed from: q, reason: collision with root package name */
    public boolean f12437q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12438r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f12439s;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.duracodefactory.logiccircuitsimulatorpro.R.attr.imageButtonStyle);
        this.f12438r = true;
        this.f12439s = true;
        A.h(this, new b(1, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f12437q;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        return this.f12437q ? View.mergeDrawableStates(super.onCreateDrawableState(i4 + 1), f12436t) : super.onCreateDrawableState(i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f1071o);
        setChecked(aVar.f1524q);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [P2.a, L.b, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new L.b(super.onSaveInstanceState());
        bVar.f1524q = this.f12437q;
        return bVar;
    }

    public void setCheckable(boolean z4) {
        if (this.f12438r != z4) {
            this.f12438r = z4;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        if (!this.f12438r || this.f12437q == z4) {
            return;
        }
        this.f12437q = z4;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z4) {
        this.f12439s = z4;
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        if (this.f12439s) {
            super.setPressed(z4);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f12437q);
    }
}
