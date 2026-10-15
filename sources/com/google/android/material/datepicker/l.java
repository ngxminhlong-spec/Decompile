package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class l implements Comparable, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new J.i(28);

    /* renamed from: o, reason: collision with root package name */
    public final Calendar f12401o;

    /* renamed from: p, reason: collision with root package name */
    public final String f12402p;

    /* renamed from: q, reason: collision with root package name */
    public final int f12403q;

    /* renamed from: r, reason: collision with root package name */
    public final int f12404r;

    /* renamed from: s, reason: collision with root package name */
    public final int f12405s;

    /* renamed from: t, reason: collision with root package name */
    public final int f12406t;

    /* renamed from: u, reason: collision with root package name */
    public final long f12407u;

    public l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a4 = u.a(calendar);
        this.f12401o = a4;
        this.f12403q = a4.get(2);
        this.f12404r = a4.get(1);
        this.f12405s = a4.getMaximum(7);
        this.f12406t = a4.getActualMaximum(5);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL, yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.f12402p = simpleDateFormat.format(a4.getTime());
        this.f12407u = a4.getTimeInMillis();
    }

    public static l b(int i4, int i5) {
        Calendar c = u.c(null);
        c.set(1, i4);
        c.set(2, i5);
        return new l(c);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l lVar) {
        return this.f12401o.compareTo(lVar.f12401o);
    }

    public final int c() {
        Calendar calendar = this.f12401o;
        int firstDayOfWeek = calendar.get(7) - calendar.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f12405s : firstDayOfWeek;
    }

    public final int d(l lVar) {
        if (!(this.f12401o instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (lVar.f12403q - this.f12403q) + ((lVar.f12404r - this.f12404r) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f12403q == lVar.f12403q && this.f12404r == lVar.f12404r;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12403q), Integer.valueOf(this.f12404r)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f12404r);
        parcel.writeInt(this.f12403q);
    }
}
