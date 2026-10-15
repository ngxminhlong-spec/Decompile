package android.support.v4.media.session;

import A.e;
import E.n;
import J.c;
import J.d;
import L3.g;
import L3.j;
import O1.r;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EdgeEffect;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1249uc;
import com.google.android.gms.internal.ads.C0258Da;
import com.google.android.gms.internal.ads.Cp;
import com.google.android.gms.internal.ads.L6;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.measurement.C1510e1;
import f.AbstractActivityC1671f;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import l.I0;
import n3.C1814a;
import n3.C1820g;
import n3.h;
import n3.i;
import n3.q;
import o2.AbstractC1895f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2397a = true;

    /* renamed from: b, reason: collision with root package name */
    public static int f2398b;
    public static int c;

    public static ArrayList A(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static JSONArray B(JsonReader jsonReader) {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONArray.put(B(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONArray.put(E(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
                }
                jSONArray.put(jsonReader.nextString());
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static boolean C(byte b4) {
        return b4 > -65;
    }

    public static JSONObject D(String str, JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static JSONObject E(JsonReader jsonReader) {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONObject.put(nextName, B(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONObject.put(nextName, E(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
                }
                jSONObject.put(nextName, jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static void F(JsonWriter jsonWriter, JSONArray jSONArray) {
        try {
            jsonWriter.beginArray();
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                Object obj = jSONArray.get(i4);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    G(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    F(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e4) {
            throw new IOException(e4);
        }
    }

    public static void G(JsonWriter jsonWriter, JSONObject jSONObject) {
        try {
            jsonWriter.beginObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    G(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    F(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e4) {
            throw new IOException(e4);
        }
    }

    public static String H(Cp cp) {
        if (cp == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            J(jsonWriter, cp);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e4) {
            Y9.q("Error when writing JSON.", e4);
            return null;
        }
    }

    public static JSONObject I(JSONObject jSONObject, String[] strArr) {
        for (int i4 = 0; i4 < strArr.length - 1; i4++) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[i4]);
        }
        return jSONObject;
    }

    public static void J(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof Cp) {
            G(jsonWriter, ((Cp) obj).d);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                J(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                J(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }

    public static void a(Object obj, StringBuilder sb) {
        int lastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static boolean b(e[] eVarArr, e[] eVarArr2) {
        if (eVarArr == null || eVarArr2 == null || eVarArr.length != eVarArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < eVarArr.length; i4++) {
            e eVar = eVarArr[i4];
            char c2 = eVar.f3a;
            e eVar2 = eVarArr2[i4];
            if (c2 != eVar2.f3a || eVar.f4b.length != eVar2.f4b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] d(float[] fArr, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i4, length);
        float[] fArr2 = new float[i4];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x007a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static A.e[] e(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.a.e(java.lang.String):A.e[]");
    }

    public static e[] f(e[] eVarArr) {
        e[] eVarArr2 = new e[eVarArr.length];
        for (int i4 = 0; i4 < eVarArr.length; i4++) {
            eVarArr2[i4] = new e(eVarArr[i4]);
        }
        return eVarArr2;
    }

    public static void g(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            C1814a c1814a = (C1814a) obj;
            C1820g c1820g = new C1820g(c1814a);
            for (q qVar : c1814a.f14113b) {
                boolean z4 = c1814a.f14114e == 0;
                h hVar = new h(qVar, !z4);
                if (!hashMap.containsKey(hVar)) {
                    hashMap.put(hVar, new HashSet());
                }
                Set set = (Set) hashMap.get(hVar);
                if (!set.isEmpty() && z4) {
                    throw new IllegalArgumentException("Multiple components provide " + qVar + ".");
                }
                set.add(c1820g);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (C1820g c1820g2 : (Set) it.next()) {
                for (i iVar : c1820g2.f14128a.c) {
                    if (iVar.c == 0) {
                        Set<C1820g> set2 = (Set) hashMap.get(new h(iVar.f14132a, iVar.f14133b == 2));
                        if (set2 != null) {
                            for (C1820g c1820g3 : set2) {
                                c1820g2.f14129b.add(c1820g3);
                                c1820g3.c.add(c1820g2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            C1820g c1820g4 = (C1820g) it3.next();
            if (c1820g4.c.isEmpty()) {
                hashSet2.add(c1820g4);
            }
        }
        while (!hashSet2.isEmpty()) {
            C1820g c1820g5 = (C1820g) hashSet2.iterator().next();
            hashSet2.remove(c1820g5);
            i4++;
            Iterator it4 = c1820g5.f14129b.iterator();
            while (it4.hasNext()) {
                C1820g c1820g6 = (C1820g) it4.next();
                c1820g6.c.remove(c1820g5);
                if (c1820g6.c.isEmpty()) {
                    hashSet2.add(c1820g6);
                }
            }
        }
        if (i4 == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            C1820g c1820g7 = (C1820g) it5.next();
            if (!c1820g7.c.isEmpty() && !c1820g7.f14129b.isEmpty()) {
                arrayList2.add(c1820g7.f14128a);
            }
        }
        throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static void h(Context context, H1.e eVar, C1510e1 c1510e1) {
        AbstractC1066q6.a(context);
        if (((Boolean) L6.f6130j.r()).booleanValue()) {
            if (((Boolean) r.d.c.a(AbstractC1066q6.x9)).booleanValue()) {
                AbstractC1249uc.f10789b.execute(new n(context, eVar, c1510e1, 3));
                return;
            }
        }
        new C0258Da(0, context, eVar.f863a).p(c1510e1);
    }

    public static float i(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return d.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Intent j(AbstractActivityC1671f abstractActivityC1671f) {
        Intent parentActivityIntent = abstractActivityC1671f.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String l4 = l(abstractActivityC1671f, abstractActivityC1671f.getComponentName());
            if (l4 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(abstractActivityC1671f, l4);
            try {
                return l(abstractActivityC1671f, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + l4 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static Intent k(AbstractActivityC1671f abstractActivityC1671f, ComponentName componentName) {
        String l4 = l(abstractActivityC1671f, componentName);
        if (l4 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), l4);
        return l(abstractActivityC1671f, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String l(Context context, ComponentName componentName) {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i4 = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i4 >= 29 ? 269222528 : i4 >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static Spanned m(Context context, String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(str), "UTF-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return Html.fromHtml(sb.toString());
                }
                sb.append(readLine);
                sb.append("\r\n");
            }
        } catch (IOException unused) {
            throw new RuntimeException(str.concat(" could not be loaded."));
        }
    }

    public static L3.i n(g gVar, L3.h hVar) {
        S3.e.e(hVar, "key");
        return S3.e.a(gVar.getKey(), hVar) ? j.f1101o : gVar;
    }

    public static float o(EdgeEffect edgeEffect, float f4, float f5) {
        if (Build.VERSION.SDK_INT >= 31) {
            return d.c(edgeEffect, f4, f5);
        }
        c.a(edgeEffect, f4, f5);
        return f4;
    }

    public static L3.i p(g gVar, L3.i iVar) {
        S3.e.e(iVar, "context");
        return AbstractC1895f.u(gVar, iVar);
    }

    public static void r(Drawable drawable, int i4) {
        drawable.setTint(i4);
    }

    public static void s(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        I0 i02 = I0.f13627x;
        if (i02 != null && i02.f13628o == view) {
            I0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new I0(view, charSequence);
            return;
        }
        I0 i03 = I0.y;
        if (i03 != null && i03.f13628o == view) {
            i03.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void v(ViewGroup viewGroup, boolean z4) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z4);
        } else if (f2397a) {
            try {
                viewGroup.suppressLayout(z4);
            } catch (NoSuchMethodError unused) {
                f2397a = false;
            }
        }
    }

    public static int w(int i4) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i5 = 0; i5 < 6; i5++) {
            int i6 = iArr[i5];
            int i7 = i6 - 1;
            if (i6 == 0) {
                throw null;
            }
            if (i7 == i4) {
                return i6;
            }
        }
        return 1;
    }

    public static Bundle x(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Double) opt).doubleValue());
                } else if (opt instanceof Integer) {
                    bundle.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof String) {
                    bundle.putString(next, (String) opt);
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i4 = 0;
                        Object obj = null;
                        for (int i5 = 0; obj == null && i5 < length; i5++) {
                            obj = !jSONArray.isNull(i5) ? jSONArray.opt(i5) : null;
                        }
                        if (obj == null) {
                            Y9.s("Expected JSONArray with at least 1 non-null element for key:".concat(String.valueOf(next)));
                        } else if (obj instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i4 < length) {
                                bundleArr[i4] = !jSONArray.isNull(i4) ? x(jSONArray.optJSONObject(i4)) : null;
                                i4++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (obj instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i4 < length) {
                                dArr[i4] = jSONArray.optDouble(i4);
                                i4++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (obj instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i4 < length) {
                                strArr[i4] = !jSONArray.isNull(i4) ? jSONArray.optString(i4) : null;
                                i4++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (obj instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i4 < length) {
                                zArr[i4] = jSONArray.optBoolean(i4);
                                i4++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            Y9.s("JSONArray with unsupported type " + obj.getClass().getCanonicalName() + " for key:" + next);
                        }
                    }
                } else if (opt instanceof JSONObject) {
                    bundle.putBundle(next, x((JSONObject) opt));
                } else {
                    Y9.s("Unsupported type for key:".concat(String.valueOf(next)));
                }
            }
        }
        return bundle;
    }

    public static String y(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length) {
                break;
            }
            Object obj = objArr[i5];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e4) {
                    String i6 = n0.a.i(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(i6), (Throwable) e4);
                    str2 = "<" + i6 + " threw " + e4.getClass().getName() + ">";
                }
            }
            objArr[i5] = str2;
            i5++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i7 = 0;
        while (true) {
            length2 = objArr.length;
            if (i4 >= length2 || (indexOf = str.indexOf("%s", i7)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i7, indexOf);
            sb.append(objArr[i4]);
            i4++;
            i7 = indexOf + 2;
        }
        sb.append((CharSequence) str, i7, str.length());
        if (i4 < length2) {
            sb.append(" [");
            sb.append(objArr[i4]);
            for (int i8 = i4 + 1; i8 < objArr.length; i8++) {
                sb.append(", ");
                sb.append(objArr[i8]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static List z(JSONArray jSONArray, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                arrayList.add(jSONArray.getString(i4));
            }
        }
        return arrayList;
    }

    public boolean c() {
        return false;
    }

    public void q() {
    }

    public abstract void t();

    public abstract void u();
}
