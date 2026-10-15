package com.google.android.gms.auth.api.signin;

import J.i;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d3.AbstractC1654b;
import h2.y;
import i2.AbstractC1717a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractC1717a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new i(25);

    /* renamed from: A, reason: collision with root package name */
    public final HashSet f3879A = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final int f3880o;

    /* renamed from: p, reason: collision with root package name */
    public final String f3881p;

    /* renamed from: q, reason: collision with root package name */
    public final String f3882q;

    /* renamed from: r, reason: collision with root package name */
    public final String f3883r;

    /* renamed from: s, reason: collision with root package name */
    public final String f3884s;

    /* renamed from: t, reason: collision with root package name */
    public final Uri f3885t;

    /* renamed from: u, reason: collision with root package name */
    public String f3886u;

    /* renamed from: v, reason: collision with root package name */
    public final long f3887v;

    /* renamed from: w, reason: collision with root package name */
    public final String f3888w;

    /* renamed from: x, reason: collision with root package name */
    public final List f3889x;
    public final String y;

    /* renamed from: z, reason: collision with root package name */
    public final String f3890z;

    public GoogleSignInAccount(int i4, String str, String str2, String str3, String str4, Uri uri, String str5, long j4, String str6, ArrayList arrayList, String str7, String str8) {
        this.f3880o = i4;
        this.f3881p = str;
        this.f3882q = str2;
        this.f3883r = str3;
        this.f3884s = str4;
        this.f3885t = uri;
        this.f3886u = str5;
        this.f3887v = j4;
        this.f3888w = str6;
        this.f3889x = arrayList;
        this.y = str7;
        this.f3890z = str8;
    }

    public static GoogleSignInAccount h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            hashSet.add(new Scope(jSONArray.getString(i4), 1));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        y.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f3886u = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f3888w.equals(this.f3888w)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f3889x);
        hashSet.addAll(googleSignInAccount.f3879A);
        HashSet hashSet2 = new HashSet(this.f3889x);
        hashSet2.addAll(this.f3879A);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int hashCode = this.f3888w.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f3889x);
        hashSet.addAll(this.f3879A);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int a02 = AbstractC1654b.a0(parcel, 20293);
        AbstractC1654b.f0(parcel, 1, 4);
        parcel.writeInt(this.f3880o);
        AbstractC1654b.V(parcel, 2, this.f3881p);
        AbstractC1654b.V(parcel, 3, this.f3882q);
        AbstractC1654b.V(parcel, 4, this.f3883r);
        AbstractC1654b.V(parcel, 5, this.f3884s);
        AbstractC1654b.U(parcel, 6, this.f3885t, i4);
        AbstractC1654b.V(parcel, 7, this.f3886u);
        AbstractC1654b.f0(parcel, 8, 8);
        parcel.writeLong(this.f3887v);
        AbstractC1654b.V(parcel, 9, this.f3888w);
        AbstractC1654b.Z(parcel, 10, this.f3889x);
        AbstractC1654b.V(parcel, 11, this.y);
        AbstractC1654b.V(parcel, 12, this.f3890z);
        AbstractC1654b.e0(parcel, a02);
    }
}
