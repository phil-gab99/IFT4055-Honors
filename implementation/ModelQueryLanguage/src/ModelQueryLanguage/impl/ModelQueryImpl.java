/**
 */
package ModelQueryLanguage.impl;

import DiningRoom.Furniture;
import ModelQueryLanguage.ModelQuery;
import ModelQueryLanguage.ModelQueryLanguagePackage;

import ModelQueryLanguage.Operator;
import Repository.Queryable;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModelQueryLanguage.impl.ModelQueryImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link ModelQueryLanguage.impl.ModelQueryImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link ModelQueryLanguage.impl.ModelQueryImpl#getContainerParameters <em>Container Parameters</em>}</li>
 *   <li>{@link ModelQueryLanguage.impl.ModelQueryImpl#getDiffParameters <em>Diff Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelQueryImpl extends EObjectImpl implements ModelQuery {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final Operator OPERATOR_EDEFAULT = Operator.WHO;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Operator operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected String subject = SUBJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainerParameters() <em>Container Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> containerParameters;

	/**
	 * The cached value of the '{@link #getDiffParameters() <em>Diff Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> diffParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelQueryLanguagePackage.Literals.MODEL_QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(Operator newOperator) {
		Operator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelQueryLanguagePackage.MODEL_QUERY__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(String newSubject) {
		String oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelQueryLanguagePackage.MODEL_QUERY__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getContainerParameters() {
		if (containerParameters == null) {
			containerParameters = new EDataTypeUniqueEList<String>(String.class, this, ModelQueryLanguagePackage.MODEL_QUERY__CONTAINER_PARAMETERS);
		}
		return containerParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDiffParameters() {
		if (diffParameters == null) {
			diffParameters = new EDataTypeUniqueEList<String>(String.class, this, ModelQueryLanguagePackage.MODEL_QUERY__DIFF_PARAMETERS);
		}
		return diffParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelQueryLanguagePackage.MODEL_QUERY__OPERATOR:
				return getOperator();
			case ModelQueryLanguagePackage.MODEL_QUERY__SUBJECT:
				return getSubject();
			case ModelQueryLanguagePackage.MODEL_QUERY__CONTAINER_PARAMETERS:
				return getContainerParameters();
			case ModelQueryLanguagePackage.MODEL_QUERY__DIFF_PARAMETERS:
				return getDiffParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelQueryLanguagePackage.MODEL_QUERY__OPERATOR:
				setOperator((Operator)newValue);
				return;
			case ModelQueryLanguagePackage.MODEL_QUERY__SUBJECT:
				setSubject((String)newValue);
				return;
			case ModelQueryLanguagePackage.MODEL_QUERY__CONTAINER_PARAMETERS:
				getContainerParameters().clear();
				getContainerParameters().addAll((Collection<? extends String>)newValue);
				return;
			case ModelQueryLanguagePackage.MODEL_QUERY__DIFF_PARAMETERS:
				getDiffParameters().clear();
				getDiffParameters().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelQueryLanguagePackage.MODEL_QUERY__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case ModelQueryLanguagePackage.MODEL_QUERY__SUBJECT:
				setSubject(SUBJECT_EDEFAULT);
				return;
			case ModelQueryLanguagePackage.MODEL_QUERY__CONTAINER_PARAMETERS:
				getContainerParameters().clear();
				return;
			case ModelQueryLanguagePackage.MODEL_QUERY__DIFF_PARAMETERS:
				getDiffParameters().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelQueryLanguagePackage.MODEL_QUERY__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case ModelQueryLanguagePackage.MODEL_QUERY__SUBJECT:
				return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
			case ModelQueryLanguagePackage.MODEL_QUERY__CONTAINER_PARAMETERS:
				return containerParameters != null && !containerParameters.isEmpty();
			case ModelQueryLanguagePackage.MODEL_QUERY__DIFF_PARAMETERS:
				return diffParameters != null && !diffParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(", subject: ");
		result.append(subject);
		result.append(", containerParameters: ");
		result.append(containerParameters);
		result.append(", diffParameters: ");
		result.append(diffParameters);
		result.append(')');
		return result.toString();
	}

} //ModelQueryImpl
