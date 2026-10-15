package com.google.android.material.datepicker;

import H.A;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.ads.Tw;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class m extends BaseAdapter {

    /* renamed from: r, reason: collision with root package name */
    public static final int f12408r = u.c(null).getMaximum(4);

    /* renamed from: o, reason: collision with root package name */
    public final l f12409o;

    /* renamed from: p, reason: collision with root package name */
    public q2.e f12410p;

    /* renamed from: q, reason: collision with root package name */
    public final b f12411q;

    public m(l lVar, b bVar) {
        this.f12409o = lVar;
        this.f12411q = bVar;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i4) {
        l lVar = this.f12409o;
        if (i4 < lVar.c() || i4 > b()) {
            return null;
        }
        int c = (i4 - lVar.c()) + 1;
        Calendar a4 = u.a(lVar.f12401o);
        a4.set(5, c);
        return Long.valueOf(a4.getTimeInMillis());
    }

    public final int b() {
        l lVar = this.f12409o;
        return (lVar.c() + lVar.f12406t) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        l lVar = this.f12409o;
        return lVar.c() + lVar.f12406t;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4 / this.f12409o.f12405s;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        String format;
        DateFormat instanceForSkeleton;
        TimeZone timeZone;
        String format2;
        DateFormat instanceForSkeleton2;
        TimeZone timeZone2;
        Context context = viewGroup.getContext();
        if (this.f12410p == null) {
            this.f12410p = new q2.e(context, 15);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        l lVar = this.f12409o;
        int c = i4 - lVar.c();
        if (c < 0 || c >= lVar.f12406t) {
            textView.setVisibility(8);
            textView.setEnabled(false);
        } else {
            int i5 = c + 1;
            textView.setTag(lVar);
            textView.setText(String.valueOf(i5));
            Calendar a4 = u.a(lVar.f12401o);
            a4.set(5, i5);
            long timeInMillis = a4.getTimeInMillis();
            int i6 = lVar.f12404r;
            Calendar b4 = u.b();
            b4.set(5, 1);
            Calendar a5 = u.a(b4);
            a5.get(2);
            int i7 = a5.get(1);
            a5.getMaximum(7);
            a5.getActualMaximum(5);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL, yyyy", Locale.getDefault());
            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
            simpleDateFormat.format(a5.getTime());
            a5.getTimeInMillis();
            if (i6 == i7) {
                Locale locale = Locale.getDefault();
                if (Build.VERSION.SDK_INT >= 24) {
                    instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("MMMEd", locale);
                    timeZone2 = TimeZone.getTimeZone("UTC");
                    instanceForSkeleton2.setTimeZone(timeZone2);
                    format2 = instanceForSkeleton2.format(new Date(timeInMillis));
                } else {
                    java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, locale);
                    dateInstance.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
                    format2 = dateInstance.format(new Date(timeInMillis));
                }
                textView.setContentDescription(format2);
            } else {
                Locale locale2 = Locale.getDefault();
                if (Build.VERSION.SDK_INT >= 24) {
                    instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMEd", locale2);
                    timeZone = TimeZone.getTimeZone("UTC");
                    instanceForSkeleton.setTimeZone(timeZone);
                    format = instanceForSkeleton.format(new Date(timeInMillis));
                } else {
                    java.text.DateFormat dateInstance2 = java.text.DateFormat.getDateInstance(0, locale2);
                    dateInstance2.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
                    format = dateInstance2.format(new Date(timeInMillis));
                }
                textView.setContentDescription(format);
            }
            textView.setVisibility(0);
            textView.setEnabled(true);
        }
        Long item = getItem(i4);
        if (item == null) {
            return textView;
        }
        if (item.longValue() >= this.f12411q.f12363r.f12366o) {
            textView.setEnabled(true);
            throw null;
        }
        textView.setEnabled(false);
        Tw tw = (Tw) this.f12410p.f14711r;
        tw.getClass();
        V2.g gVar = new V2.g();
        V2.g gVar2 = new V2.g();
        V2.k kVar = (V2.k) tw.f7101f;
        gVar.setShapeAppearanceModel(kVar);
        gVar2.setShapeAppearanceModel(kVar);
        gVar.i((ColorStateList) tw.d);
        float f4 = tw.f7098a;
        ColorStateList colorStateList = (ColorStateList) tw.f7100e;
        gVar.f1880o.f1861j = f4;
        gVar.invalidateSelf();
        V2.f fVar = gVar.f1880o;
        if (fVar.d != colorStateList) {
            fVar.d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        ColorStateList colorStateList2 = (ColorStateList) tw.c;
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList2.withAlpha(30), gVar, gVar2);
        Rect rect = (Rect) tw.f7099b;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap weakHashMap = A.f779a;
        textView.setBackground(insetDrawable);
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
